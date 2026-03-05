package com.vinncorp.demo.soapcoursemanagement.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurer;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig {

    // ✅ Only ONE servlet bean
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(
            ApplicationContext context) {

        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(context);
        servlet.setTransformWsdlLocations(true);

        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    // =========================
    // STUDENT WSDL
    // =========================

    @Bean(name = "students")
    public DefaultWsdl11Definition studentWsdlDefinition(XsdSchema studentSchema) {

        DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
        wsdl.setPortTypeName("StudentPort");
        wsdl.setLocationUri("/ws");
        wsdl.setTargetNamespace("http://example.com/student");
        wsdl.setSchema(studentSchema);

        return wsdl;
    }

    @Bean
    public XsdSchema studentSchema() {
        return new SimpleXsdSchema(
                new ClassPathResource("student.xsd"));
    }

    // =========================
    // COURSE WSDL
    // =========================

    @Bean(name = "courses")
    public DefaultWsdl11Definition courseWsdlDefinition(XsdSchema courseSchema) {

        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("CoursePort");
        definition.setLocationUri("/ws");
        definition.setTargetNamespace("http://example.com/courses");
        definition.setSchema(courseSchema);

        return definition;
    }

    @Bean
    public XsdSchema courseSchema() {
        return new SimpleXsdSchema(
                new ClassPathResource("course-details.xsd"));
    }

}