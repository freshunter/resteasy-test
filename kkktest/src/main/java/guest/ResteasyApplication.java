package guest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class ResteasyApplication extends Application {

//    @Override
//    public Set<Object> getSingletons() {
//        Set<Object> set = new HashSet<Object>();
//        set.add(new LocationResourceImpl());
//        return set;
//    }

    @Override
    public Set<Class<?>> getClasses() {
        return super.getClasses();
    }
}