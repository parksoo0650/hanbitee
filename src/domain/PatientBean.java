package domain;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data public class PatientBean{
    @Setter @Getter
    private String patID, docID, nurID,patPass, majorTreat, patName, patGen, parJumin,patPhone, patEmail, patArr,patJob;
    
 
    
}