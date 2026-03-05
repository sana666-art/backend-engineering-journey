package com.vinncorp.demo.soapcoursemanagement.endpoint;

import com.vinncorp.demo.soapcoursemanagement.soap.*;
import com.vinncorp.demo.soapcoursemanagement.soap.bean.Course;
import com.vinncorp.demo.soapcoursemanagement.soap.exception.CourseNotFindException;
import com.vinncorp.demo.soapcoursemanagement.soap.service.CourseDetailsService;
import com.vinncorp.demo.soapcoursemanagement.soap.DeleteCourseDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class CourseEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/courses";

    @Autowired
    CourseDetailsService service;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetCourseDetailsRequest")
    @ResponsePayload
    public GetCourseDetailsResponse getCourseDetails(
            @RequestPayload GetCourseDetailsRequest request) throws CourseNotFindException {

        Course course = service.findCourseById(request.getId());

        if (course == null) {
//            throw new RuntimeException("Invalid course ID " + request.getId());
            throw new CourseNotFindException("Invalid course ID " + request.getId());
        }

        return mapCourse(course);
    }

    //get all course details
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetAllCourseDetailsRequest")
    @ResponsePayload
    public GetAllCourseDetailsResponse getAllCourseDetailsRequest(@RequestPayload GetAllCourseDetailsRequest request) {

        List<Course> courses = service.findAllCourses();

        return mapAllCourseDetails(courses);
    }

    //delete course request
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeleteCourseDetailsRequest")
    @ResponsePayload
    public DeleteCourseDetailsResponse deleteCourseDetailsRequest(
            @RequestPayload DeleteCourseDetailsRequest request) {

        CourseDetailsService.Status status = service.deleteCourseById(request.getId());

        DeleteCourseDetailsResponse response = new DeleteCourseDetailsResponse();
        response.setStatus(mapStatus(status).ordinal());

        return response;
    }

    private CourseDetailsService.Status mapStatus(CourseDetailsService.Status status) {
        if (status == CourseDetailsService.Status.SUCCESS) {
            return CourseDetailsService.Status.SUCCESS;
        }
        return CourseDetailsService.Status.FAILURE;
    }

    private GetCourseDetailsResponse mapCourse(Course course) {

        GetCourseDetailsResponse response = new GetCourseDetailsResponse();

        CourseDetails courseDetail = new CourseDetails();

        courseDetail.setId(course.getId());
        courseDetail.setName(course.getName());
        courseDetail.setDescription(course.getDescription());

        response.setCourseDetails(courseDetail);

        return response;
    }

    private GetAllCourseDetailsResponse mapAllCourseDetails(List<Course> courses) {

        GetAllCourseDetailsResponse response = new GetAllCourseDetailsResponse();
        for( Course course : courses ) {
            CourseDetails mapcourse = mapCourse(course).getCourseDetails();
            response.getCourseDetails().add(mapcourse);
        }
        return response;
    }

}
