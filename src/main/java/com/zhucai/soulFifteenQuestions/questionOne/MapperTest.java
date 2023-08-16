package com.zhucai.soulFifteenQuestions.questionOne;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.util.StopWatch;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * @Desc: MapperTest
 * @Auth: GaoLin
 * @Date: 2023/8/16 16:18
 * 如我们经常在代码中会对一个数据结构封装成 DO、SDO、DTO、VO 等，而
 * 这些 Bean 中的大部分属性都是一样的，所以使用属性拷贝类工具可以帮助我们节省
 * 大量的 set 和 get 操作。
 * 市面上有很多类似的工具类，比较常用的有
 * 1. Spring BeanUtils
 * 2. Cglib BeanCopier
 * 3. Apache BeanUtils
 * 4. Apache PropertyUtils
 * 5. Dozer
 * 那么，我们到底应该选择哪种工具类更加合适呢？为什么 Java 开发手册中提到
 * 禁止使用 Apache BeanUtils 呢?
 */
public class MapperTest {

    private void mappingBySpringBeanUtils(PersonDO personDO, int times) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < times; i++) {
            PersonDTO personDTO = new PersonDTO();
            org.springframework.beans.BeanUtils.copyProperties(personDO,personDTO);
        }
        stopWatch.stop();
        System.out.println("mappingBySpringBeanUtils cost :" + stopWatch.getTotalTimeMillis());
    }

    private void mappingByCglibBeanCopier(PersonDO personDO, int times) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < times; i++) {
            PersonDTO personDTO = new PersonDTO();
            BeanCopier beanCopier = BeanCopier.create(PersonDO.class, PersonDTO.class,false);
            beanCopier.copy(personDO,personDTO,null);
        }
        stopWatch.stop();
        System.out.println("mappingByCglibBeanCopier cost :" + stopWatch.getTotalTimeMillis());
    }

    private void mappingByApacheBeanUtils(PersonDO personDO, int times) throws InvocationTargetException, IllegalAccessException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < times; i++) {
            PersonDTO personDTO = new PersonDTO();
            BeanUtils.copyProperties(personDO,personDTO);
        }
        stopWatch.stop();
        System.out.println("mappingByApacheBeanUtils cost :" + stopWatch.getTotalTimeMillis());
    }


    private void mappingByApachePropertyUtils(PersonDO personDO, int times)
            throws InvocationTargetException, IllegalAccessException,
            NoSuchMethodException{
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        for (int i = 0; i < times; i++) {
            PersonDTO personDTO = new PersonDTO();
            PropertyUtils.copyProperties(personDTO, personDO);
        }
        stopwatch.stop();
        System.out.println("mappingByApachePropertyUtils cost :" + stopwatch.
                getTotalTimeMillis());
    }


    public static void main(String[] args)
            throws InvocationTargetException, IllegalAccessException,
            NoSuchMethodException {
        PersonDO personDO = new PersonDO();
        personDO.setName("Hollis");
        personDO.setAge(26);
        personDO.setBirthday(new Date());
        personDO.setId(1);
        MapperTest mapperTest = new MapperTest();
        mapperTest.mappingBySpringBeanUtils(personDO, 100);
        mapperTest.mappingBySpringBeanUtils(personDO, 1000);
        mapperTest.mappingBySpringBeanUtils(personDO, 10000);
        mapperTest.mappingBySpringBeanUtils(personDO, 100000);
        mapperTest.mappingBySpringBeanUtils(personDO, 1000000);
        System.out.println("111111111111111111");
        mapperTest.mappingByCglibBeanCopier(personDO, 100);
        mapperTest.mappingByCglibBeanCopier(personDO, 1000);
        mapperTest.mappingByCglibBeanCopier(personDO, 10000);
        mapperTest.mappingByCglibBeanCopier(personDO, 100000);
        mapperTest.mappingByCglibBeanCopier(personDO, 1000000);

        mapperTest.mappingByApachePropertyUtils(personDO, 100);
        mapperTest.mappingByApachePropertyUtils(personDO, 1000);
        mapperTest.mappingByApachePropertyUtils(personDO, 10000);
        mapperTest.mappingByApachePropertyUtils(personDO, 100000);
        mapperTest.mappingByApachePropertyUtils(personDO, 1000000);

        mapperTest.mappingByApacheBeanUtils(personDO, 100);
        mapperTest.mappingByApacheBeanUtils(personDO, 1000);
        mapperTest.mappingByApacheBeanUtils(personDO, 10000);
        mapperTest.mappingByApacheBeanUtils(personDO, 100000);
        mapperTest.mappingByApacheBeanUtils(personDO, 1000000);
    }


    }
