package xin.saul.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xin.saul.demo.dao.EmployeeDao;
import xin.saul.demo.model.Employee;

import java.util.List;

@Component
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeDao employeeDao;
    @Override
    public void update( Employee employee) {
        employeeDao.update(employee);
    }

    @Override
    public void deleteById( long id) {
        employeeDao.deleteById(id);
    }

    @Override
    public Employee queryById( long id) {
        return employeeDao.queryById(id);
    }

    @Override
    public void add( Employee employee) {
        employeeDao.add(employee);
    }

    @Override
    public List<Employee> queryAll() {
        return employeeDao.queryAll();
    }
}
