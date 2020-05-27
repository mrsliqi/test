package project3.junit;

import org.junit.Test;
import project3.domain.Employee;
import project3.service.NameListService;
import project3.service.TeamException;

/**
 * 对NameListService进行测试
 */
public class NameListServiceTest {
    @Test
    public void testgetAllEmployees(){
        NameListService nameListService = new NameListService();
        Employee[] employees = nameListService.getAllEmployees();
        for (int i = 0;i < employees.length;i++){
            System.out.println(employees[i].toString());
        }
    }
    @Test
    public void testgetEmployee(){
        NameListService nameListService = new NameListService();
        int id = 2;
        try {
            Employee employees = nameListService.getEmployee(id);
            System.out.println(employees);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }

    }
}
