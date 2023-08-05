package lk.ijse.gdse.aad.spring_testmvc;

import lk.ijse.gdse.aad.spring_testmvc.config.WebAppConfig;
import lk.ijse.gdse.aad.spring_testmvc.config.WebRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {WebRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebAppConfig.class} ;
    }



    @Override
    protected String[] getServletMappings() { // default mapping
        return new String[] {"/"};
    }
}
