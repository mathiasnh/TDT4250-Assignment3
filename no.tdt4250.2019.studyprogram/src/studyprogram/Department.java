/**
 */
package studyprogram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.Department#getName <em>Name</em>}</li>
 *   <li>{@link studyprogram.Department#getSchool <em>School</em>}</li>
 *   <li>{@link studyprogram.Department#getCourses <em>Courses</em>}</li>
 *   <li>{@link studyprogram.Department#getPrograms <em>Programs</em>}</li>
 * </ul>
 *
 * @see studyprogram.StudyprogramPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyprogram.StudyprogramPackage#getDepartment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyprogram.Department#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>School</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyprogram.University#getDepartments <em>Departments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School</em>' container reference.
	 * @see #setSchool(University)
	 * @see studyprogram.StudyprogramPackage#getDepartment_School()
	 * @see studyprogram.University#getDepartments
	 * @model opposite="departments" transient="false"
	 * @generated
	 */
	University getSchool();

	/**
	 * Sets the value of the '{@link studyprogram.Department#getSchool <em>School</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School</em>' container reference.
	 * @see #getSchool()
	 * @generated
	 */
	void setSchool(University value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link studyprogram.Course}.
	 * It is bidirectional and its opposite is '{@link studyprogram.Course#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see studyprogram.StudyprogramPackage#getDepartment_Courses()
	 * @see studyprogram.Course#getDepartment
	 * @model opposite="department" containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link studyprogram.Program}.
	 * It is bidirectional and its opposite is '{@link studyprogram.Program#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see studyprogram.StudyprogramPackage#getDepartment_Programs()
	 * @see studyprogram.Program#getDepartment
	 * @model opposite="department" containment="true"
	 * @generated
	 */
	EList<Program> getPrograms();

} // Department
