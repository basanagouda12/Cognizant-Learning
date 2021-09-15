import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.basu.mockito.todo.ToDoBusiness;
import com.basu.mockito.todo.ToDoService;
import com.basu.mockito.todo.ToDoServiceStub;

public class ToDoBudinessStub {

	@Test  
    public void test() {  
          
        ToDoService doServiceStub = new ToDoServiceStub();   
              
        ToDoBusiness business = new ToDoBusiness(doServiceStub);  
      
        List<String> retrievedtodos = business.getTodosforSpring(" Dummy ");  
          
        assertEquals(4, retrievedtodos.size());  
       System.out.println(" Stub is working correctly...!!");  
       }  

}
