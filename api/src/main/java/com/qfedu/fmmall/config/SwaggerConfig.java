package com.qfedu.fmmall.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

//    swagger会帮助生成接口文档
    /**
     * 1.配置文档信息
     * 2.配置生成规则
     */

    /**
     * Docket封装接口文档信息
     *
     * @return
     */
    @Bean
    public Docket getDocket() {

        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
//        封面信息
        apiInfoBuilder.title("《学生生活服务管理系统》后端接口说明")//题目
                .description("此文档详细说明了学生生活服务管理系统项目后端接口规范...")//详细说明
                .version("v1.0.0")//版本
                .contact(new Contact("宠", "www.chong.con", "743414915@qq.com"));//联系人信息

        ApiInfo apiInfo = apiInfoBuilder.build();

        Docket docket = new Docket(DocumentationType.SWAGGER_2)//指定文档风格
                .apiInfo(apiInfo)//指定生成的文档中的封面信息：包括文档标题、版本、作者
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.qfedu.fmmall.controller"))//只对改路径下的控制器生成接口文档
//                .paths(PathSelectors.regex("/user/"))//表示只对user开头的请求产生说明
                .paths(PathSelectors.any())//表示对所有的请求产生说明
                .build();


        return docket;
    }

}
