package in.kpmg.aissql.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Ais")
public class Ais {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)         
	private long id;                                        
                                                              
	@Column(name="Employee_id" , nullable=false)
	private long empid;

	@Column(name="LOC_Number", nullable=false)
	private String locNumber;

	@Column(name="Patient_Name", nullable=false)
	private String patientName;

	@Column(name="Patient_Age", nullable=false)
	private byte patientAge;

	@Column(name="Patient_Gender", nullable=false)
	private String patientGender;

	@Column(name="Patient_Relation", nullable=false)
	private String patientRelation;

	@Column(name="NWH_YN", nullable=false)
	private String nwh;

	@Column(name="Hospital_State", nullable=false)
	private String hospitalState;

	@Column(name="hospital_District", nullable=false)
	private String hospitalDistrict;

	@Column(name="Hospital_ID", nullable=false)
	private String hospital_ID;

	@Column(name="Hospital_Name", nullable=false)
	private String hospitalName;

	@Column(name="Contact_No", nullable=false)
	private long Contact_No;

	@Column(name="Treatment_Description", nullable=false)
	private String treatmentDescription;

	@Column(name="LOC_Amount", nullable=false)
	private String locAmount;

}
