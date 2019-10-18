/**
 */
package studyprogram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.StudyPlan#getName <em>Name</em>}</li>
 *   <li>{@link studyprogram.StudyPlan#getYears <em>Years</em>}</li>
 *   <li>{@link studyprogram.StudyPlan#getProgram <em>Program</em>}</li>
 *   <li>{@link studyprogram.StudyPlan#getSpesialisations <em>Spesialisations</em>}</li>
 * </ul>
 *
 * @see studyprogram.StudyprogramPackage#getStudyPlan()
 * @model
 * @generated
 */
public interface StudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyprogram.StudyprogramPackage#getStudyPlan_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyprogram.StudyPlan#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Years</b></em>' containment reference list.
	 * The list contents are of type {@link studyprogram.Year}.
	 * It is bidirectional and its opposite is '{@link studyprogram.Year#getStudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Years</em>' containment reference list.
	 * @see studyprogram.StudyprogramPackage#getStudyPlan_Years()
	 * @see studyprogram.Year#getStudyPlan
	 * @model opposite="studyPlan" containment="true" upper="5"
	 * @generated
	 */
	EList<Year> getYears();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyprogram.Program#getStudyPlans <em>Study Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' container reference.
	 * @see #setProgram(Program)
	 * @see studyprogram.StudyprogramPackage#getStudyPlan_Program()
	 * @see studyprogram.Program#getStudyPlans
	 * @model opposite="studyPlans" transient="false"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link studyprogram.StudyPlan#getProgram <em>Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' container reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Spesialisations</b></em>' containment reference list.
	 * The list contents are of type {@link studyprogram.Specialisation}.
	 * It is bidirectional and its opposite is '{@link studyprogram.Specialisation#getStudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spesialisations</em>' containment reference list.
	 * @see studyprogram.StudyprogramPackage#getStudyPlan_Spesialisations()
	 * @see studyprogram.Specialisation#getStudyPlan
	 * @model opposite="studyPlan" containment="true"
	 * @generated
	 */
	EList<Specialisation> getSpesialisations();

} // StudyPlan
