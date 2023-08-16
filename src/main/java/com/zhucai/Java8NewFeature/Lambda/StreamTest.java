package com.zhucai.Java8NewFeature.Lambda;

import com.google.common.collect.Lists;
import lombok.Data;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author 高林
 * @Desc: Stream学习
 * @Auth: GaoLin
 * @Date: 2023/2/6 17:44
 */

public class StreamTest {

    public static List<User> getUserList() {
        List<User> userList = Lists.newArrayList();

        userList.add(new User(1,"张三",18,"上海",getInterestList("篮球,足球")));
        userList.add(new User(2,"王五",16,"上海",getInterestList("唱歌,跳舞,跑步")));
        userList.add(new User(3,"李四",20,"上海",getInterestList("篮球,跑步")));
        userList.add(new User(4,"张雷",22,"北京",getInterestList("篮球,保龄球")));
        userList.add(new User(5,"张超",15,"深圳",getInterestList("棒球,跑步")));
        userList.add(new User(6,"李雷",24,"北京",getInterestList("篮球,滑冰")));
        userList.add(new User(7,"王爷",21,"上海",getInterestList("滑板,排球")));
        userList.add(new User(8,"张三丰",18,"广州",getInterestList("篮球,跑步")));
        userList.add(new User(9,"赵六",16,"广州",getInterestList("篮球,跑步,排球")));
        userList.add(new User(10,"赵无极",26,"深圳",getInterestList("篮球,跑步,乒乓")));
        return userList;
    }

    @Data
    public static class User {
        private Integer id;
        private String name;
        private Integer age;
        private String city;

        private List<Interest> interestList;

        public User(Integer id, String name, Integer age, String city, List<Interest> interestList) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.city = city;
            this.interestList = interestList;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", city='" + city + '\'' +
                    '}';
        }
    }

    public static List<Interest>  getInterestList(String interests) {
        return Arrays.asList(interests.split(",")).stream().map(x -> new Interest(x)).collect(Collectors.toList());
    }
    @Data
    private static class Interest {
        private String name;

        public Interest(String name) {
            this.name = name;
        }
    }


    /**
     * @Date 2023/2/7 13:49  @Author GaoLin  @Description :创建Stream
    **/
    @Test
    public void creatStream() {
        //1、函数创建
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
        stream1.forEach(System.out::println);

        //2、Collection集合创建
        List<Integer> integerList = Lists.newArrayList();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        Stream<Integer> stream2 = integerList.stream();
        stream2.forEach(System.out::println);

        //3、Array数组创建
        int[] intArr = {1, 2, 3, 4, 5};
        IntStream arrayStream = Arrays.stream(intArr);
        arrayStream.forEach(System.out::println);

        //4、iterator函数创建
        Stream<Integer> iterateStream = Stream.iterate(0, n -> n + 2).limit(5);
        iterateStream.forEach(System.out::println);

        //5、generator函数创建
        Stream<Double> generateStream = Stream.generate(Math::random).limit(5);
        generateStream.forEach(System.out::println);
    }

    /**
     * @Date 2023/2/7 13:53  @Author GaoLin  @Description :中间操作符（Intermediate Optional）
     * ● 无状态（Stateless）操作：指元素的处理不受之前元素的影响
     *      unordered() filter() map() mapToInt() mapToLong() mapToDouble() flatMapToInt()
     *      flatMapToLong() flatMapToDouble() peek()
     * ● 有状态（Stateful）操作：指该操作只有拿到所有元素之后才能继续下去
     *      distinct() sorted() sorted() limit() skip()
    **/

    @Test
    public void intermediateOptionalTest() {
        List<User> userList = getUserList();
        //1、filter
        //List<User> filterList = userList.stream().filter(u -> u.getId()>6).collect(Collectors.toList());
        //filterList.forEach(System.out::println);

        //2、map
        //List<String> mapList = userList.stream().map(x -> x.getName()+"用户").collect(Collectors.toList());
        //mapList.forEach(System.out::println);

        //3、distinct
        //List<String> distinctList = userList.stream().map(x -> x.getCity()).distinct().collect(Collectors.toList());
        //distinctList.forEach(System.out::println);

        //4、sorted
        //userList.stream().sorted(Comparator.comparing(User::getName).reversed()).collect(Collectors.toList()).forEach(System.out::println);

        //5、limit
        //userList.stream().limit(5).collect(Collectors.toList()).forEach(System.out::println);

        //6、skip
        //userList.stream().skip(7).collect(Collectors.toList()).forEach(System.out::println);

        //7、flatMap TODO
        //userList.stream().flatMap(user -> Arrays.stream(user.getCity().split(","))).forEach(System.out::println);

        //8、peek可以修改流中元素
        userList.stream().peek(user-> user.setId(user.getId()+1)).forEach(System.out::println);

        /**
         * map 和 flatMap 的区别
         *  map：对流中每一个元素进行处理
         *  flatMap：流扁平化，让你把一个流中的“每个值”都换成另一个流，然后把所有的流连接起来成为一个流
         * 本质区别：map是对一级元素进行操作，flatmap是对二级元素操作map返回一个值；flatmap返回一个流，多个值
         */

        //需求：给List<User>对象，需要获取到List<String> interestNameList对象

        //用map解决1
        //List<List<Interest>> interestList = userList.stream().map(User::getInterestList).collect(Collectors.toList());
        //List<String> interestNameList1 = Lists.newArrayList();
        //interestList.forEach(x ->
        //        x.forEach(i -> {
        //            interestNameList1.add(i.getName());
        //}));
        //System.out.println("interestNameList1 ------------- start" + interestNameList1.size());
        //interestNameList1.forEach(System.out::println);
        //System.out.println("interestNameList1 ------------- end");

        //用map解决2
        //List<String> interestNameList2 = Lists.newArrayList();
        //userList.forEach(user ->
        //    user.getInterestList().forEach(i -> {
        //        interestNameList2.add(i.getName());
        //}));
        //System.out.println("interestNameList2 ------------- start" + interestNameList2.stream().distinct().collect(Collectors.toList()).size());
        //interestNameList2.stream().distinct().forEach(System.out::println);
        //System.out.println("interestNameList2 ------------- end");

        //用flatMap解决
        //List<String> interestNames = userList.stream()
        //        .map(User::getInterestList)
        //        .flatMap(Collection::stream)
        //        .map(x->x.getName())
        //        .collect(Collectors.toList());
        //System.out.println("interestNames ========= start " + interestNames.size());
        //interestNames.forEach(System.out::println);
        //System.out.println("interestNames ========= end ");
    }

    /**
     * @Date 2023/2/7 16:53  @Author GaoLin  @Description : 终结操作(Terminal Optional)
     * 终结操作可分为：
     * ● 短路（Short-circuiting）操作：指遇到某些符合条件的元素就可以得到最终结果
     *      anyMatch() allMatch() noneMatch() findFirst() findAny()
     * ● 非短路（Unshort-circuiting）操作：指必须处理完所有元素才能得到最终结果
     *      forEach() forEachordered() toArray() reduce() collect() max() min()count()
    **/
    @Test
    public void terminalOptionalTest() {
        List<User> userList = getUserList();
        //1、collect
        Set set = userList.stream().collect(Collectors.toSet());
        set.forEach(System.out::println);
        System.out.println("-------------------------");
        List list = userList.stream().collect(Collectors.toList());
        list.forEach(System.out::println);

        //2、findFirst返回第一个元素
        User firstUser = userList.stream().findFirst().get();
        System.out.println("firstUser = " + firstUser);

        //3、findAny：将返回当前流中的任意元素
        User anyUser = userList.stream().findAny().get();
        System.out.println("anyUser = " + anyUser);

        //4、count
        long count = userList.stream().count();
        System.out.println("count = " + count);

        //5、sum
        int sum = userList.stream().mapToInt(user -> user.getAge()).sum();
        System.out.println("sum = " + sum);
        //6、max
        int max = userList.stream().max(Comparator.comparingInt(User::getId)).get().getId();
        System.out.println("max = " + max);
        //7、min
        int min = userList.stream().min(Comparator.comparingInt(User::getId)).get().getId();
        System.out.println("min = " + min);
        //8、anyMatch
        boolean matchAny = userList.stream().anyMatch(user -> "北京".equals(user.getCity()));
        System.out.println("matchAny = " + matchAny);

        //9、allMatch
        boolean matchAll = userList.stream().allMatch(user -> "北京".equals(user.getCity()));
        System.out.println("matchAll = " + matchAll);

        //10、noneMatch
        boolean nonaMatch = userList.stream().noneMatch(user -> "云南".equals(user.getCity()));
        System.out.println("nonaMatch = " + nonaMatch);
        //11、reduce 可以将流中元素反复结合起来，得到一个值
        Optional reduce = userList.stream().reduce((user, user2) -> {
            return user;
        });
        if(reduce.isPresent()) {
            System.out.println(reduce.get());
        }

    }
    
    /**
     * @Date 2023/2/7 17:34  @Author GaoLin  @Description :Collect收集
     * Collector：结果收集策略的核心接口，具备将指定元素累加存放到结果容器中的能力；
     * 并在Collectors工具中提供了Collector接口的实现类
    **/
    @Test
    public void collectTest () {
        List<User> userList = getUserList();
        //1、toList
        List<Integer> idList = userList.stream().map(User::getId).collect(Collectors.toList()) ;
        //2、toMap
        Map<Integer,String> map = userList.stream().collect(Collectors.toMap(User::getId, User::getName));
        //3、toSet
        Set<String> setList = userList.stream().map(User::getCity).collect(Collectors.toSet()) ;
        //4、counting
        long count1 = userList.stream().filter(user -> user.getId()>1).collect(Collectors.counting());
        System.out.println("count1 = " + count1);
        long count2 = userList.stream().filter(user -> user.getId()>1).count();
        System.out.println("count2 = " + count2);
        //5、summingInt
        Integer sumInt1 = userList.stream().filter(user -> user.getId()>2).collect(Collectors.summingInt(User::getId)) ;
        System.out.println("sumInt1 = " + sumInt1);
        int sumInt2 = userList.stream().filter(user -> user.getId()>2).mapToInt(user -> user.getId()).sum();
        System.out.println("sumInt2 = " + sumInt2);
        //6、maxBy,minBy
        User maxId1 = userList.stream().collect(Collectors.maxBy(Comparator.comparingInt(User::getId))).get() ;
        System.out.println("maxId1 = " + maxId1);
        User maxId2 = userList.stream().max(Comparator.comparingInt(User::getId)).get();
        System.out.println("maxId2 = " + maxId2);

        User minId1 = userList.stream().collect(Collectors.minBy(Comparator.comparingInt(User::getId))).get() ;
        System.out.println("minId1 = " + minId1);
        User minId2 = userList.stream().min(Comparator.comparingInt(User::getId)).get();
        System.out.println("minId2 = " + minId2);

        //7、joining
        String joinCity = userList.stream().map(User::getCity).collect(Collectors.joining("||"));
        System.out.println("joinCity = " + joinCity);
        //8、groupingBy(按条件分组，以城市对用户进行分组；)
        Map<String,List<User>> groupCity = userList.stream().collect(Collectors.groupingBy(User::getCity));
        System.out.println("groupCity = " + groupCity);

        Map<String,List<User>> groupCountCity = userList.stream().collect(Collectors.groupingBy(User::getCity));
        System.out.println("groupCountCity = " + groupCountCity);
        //9、orElse(null)
        //10、orElseGet(null)

        /**
         * orElse(null)和orElseGet(null)区别：
         * 1、当返回Optional的值是空值null时，无论orElse还是orElseGet都会执行
         * 2、而当返回的Optional有值时，orElse会执行，而orElseGet不会执行
        **/

         /**
          *   orElse(null)表示如果一个都没找到返回null（orElse()中可以塞默认值。如果找不到就会返回orElse中设置的默认值）
          *   orElseGet(null)表示如果一个都没找到返回null（orElseGet()中可以塞默认值。如果找不到就会返回orElseGet中设置的默认值）
          *   orElse()和orElseGet()区别：在使用方法时，即使没有值 也会执行 orElse 内的方法， 而 orElseGet则不会
        */
        //没值
        User a =  userList.stream().filter(userT-> userT.getAge() == 12).findFirst().orElse(getMethod("a"));
        User b =  userList.stream().filter(userT11-> userT11.getAge() == 12).findFirst().orElseGet(()->getMethod("b"));
        //有值
        User c =  userList.stream().filter(userT2-> userT2.getAge() == 16).findFirst().orElse(getMethod("c"));
        User d =  userList.stream().filter(userT22-> userT22.getAge() == 16).findFirst().orElseGet(()->getMethod("d"));
        System.out.println("a："+a);
        System.out.println("b："+b);
        System.out.println("c："+c);
        System.out.println("d："+d);


    }

    public static User getMethod(String name){
        System.out.println(name + "执行了方法22222");

        return null;
    }

}
