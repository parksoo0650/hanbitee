package serviceImpl;
import domain.PatientBean;
import service.PatientService;
import java.sql.Statement;

import dao.PatientDAO;
import daoImpl.PatientDAOImpl;
public class PatientServiceImpl implements PatientService{
    private PatientDAO dao;
    private static PatientServiceImpl instance = new PatientServiceImpl();
    private PatientBean session;
    public static PatientServiceImpl getInstance() {
        return instance;
    }
    private PatientServiceImpl() {
	dao = PatientDAOImpl.getInstance();
	session = new PatientBean();
    }
    @Override
    public PatientBean findById(String id) throws Exception{
	return dao.selectById(id); 
	//patientDAOImpl.getInstance().selectById(id);
    }
    @Override
    public PatientBean login(PatientBean patient) throws Exception{
	/*PatientBean temp = this.findById(patient.getDocID());
	if(patient.getPatPass().equals(temp.getPatPass())){
	    flag=true;
	    session=temp;
	}*/
	
	return this.findById(patient.getPatID());
	//patientDAOImpl.getInstance().login(patient);
    }

    @Override
    public int join(PatientBean patient) throws Exception {
	return dao.insert(patient); 
	//patientDAOImpl.getInstance().insert(patient);
    }
    @Override
    public int change(PatientBean patient) throws Exception {
	return dao.update(patient); 
	//patientDAOImpl.getInstance().update(patient);
    }

    @Override
    public int remove(PatientBean patient) throws Exception {
	return dao.delete(patient); 
	//patientDAOImpl.getInstance().delete(patient);
    }
    @Override
    public boolean logout(PatientBean patient) throws Exception {
	return true;
    }
}
