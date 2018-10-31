/**
 * @author Created by pangkunkun on 2018/10/29.
 */
module SpringFirst {
        //这里需要指定到具体某个包，如SpringApplication这个类在spring.boot下
        requires spring.boot;
        requires spring.boot.autoconfigure;
        requires spring.web;
        requires spring.beans;
        requires slf4j.api;

        requires SpringSecond;
        requires SpringThird;
}