/**
 */
package studyprogram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.Program#getName <em>Name</em>}</li>
 *   <li>{@link studyprogram.Program#getDepartment <em>Department</em>}</li>
 *   <li>{@link studyprogram.Program#getStudyPlans <em>Study Plans</em>}</li>
 *   <li>{@link studyprogram.Program#getElectiveCourses <em>Elective Courses</em>}</li>
 *   <li>{@link studyprogram.Program#getObligatoryCourses <em>Obligatory Courses</em>}</li>
 * </ul>
 *
 * @see studyprogram.StudyprogramPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyprogram.StudyprogramPackage#getProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyprogram.Program#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyprogram.Department#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' container reference.
	 * @see #setDepartment(Department)
	 * @see studyprogram.StudyprogramPackage#getProgram_Department()
	 * @see studyprogram.Department#getPrograms
	 * @model opposite="programs" transient="false"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link studyprogram.Program#getDepartment <em>Department</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' container reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

	/**
	 * Returns the value of the '<em><b>Study Plans</b></em>' containment reference list.
	 * The list contents are of type {@link studyprogram.StudyPlan}.
	 * It is bidirectional and its opposite is '{@link studyprogram.StudyPlan#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plans</em>' containment reference list.
	 * @see studyprogram.StudyprogramPackage#getProgram_StudyPlans()
	 * @see studyprogram.StudyPlan#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	EList<StudyPlan> getStudyPlans();

	/**
	 * Returns the value of the '<em><b>Elective Courses</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link studyprogram.ElectiveCourses#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elective Courses</em>' containment reference.
	 * @see #setElectiveCourses(ElectiveCourses)
	 * @see studyprogram.StudyprogramPackage#getProgram_ElectiveCourses()
	 * @see studyprogram.ElectiveCourses#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	ElectiveCourses getElectiveCourses();

	/**
	 * Sets the value of the '{@link studyprogram.Program#getElectiveCourses <em>Elective Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elective Courses</em>' containment reference.
	 * @see #getElectiveCourses()
	 * @generated
	 */
	void setElectiveCourses(ElectiveCourses value);

	/**
	 * Returns the value of the '<em><b>Obligatory Courses</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link studyprogram.ObligatoryCourses#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obligatory Courses</em>' containment reference.
	 * @see #setObligatoryCourses(ObligatoryCourses)
	 * @see studyprogram.StudyprogramPackage#getProgram_ObligatoryCourses()
	 * @see studyprogram.ObligatoryCourses#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	ObligatoryCourses getObligatoryCourses();

	/**
	 * Sets the value of the '{@link studyprogram.Program#getObligatoryCourses <em>Obligatory Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obligatory Courses</em>' containment reference.
	 * @see #getObligatoryCourses()
	 * @generated
	 */
	void setObligatoryCourses(ObligatoryCourses value);

} // Program
