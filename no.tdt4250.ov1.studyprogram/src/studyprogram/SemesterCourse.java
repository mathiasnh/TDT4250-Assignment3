/**
 */
package studyprogram;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.SemesterCourse#getType <em>Type</em>}</li>
 *   <li>{@link studyprogram.SemesterCourse#getName <em>Name</em>}</li>
 *   <li>{@link studyprogram.SemesterCourse#getSemester <em>Semester</em>}</li>
 *   <li>{@link studyprogram.SemesterCourse#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see studyprogram.StudyprogramPackage#getSemesterCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='obligatorySlotShouldOnlyHaveOneCourse obligatorySlotShouldNotContainElectives electiveSlotShouldNotContainObligatory'"
 * @generated
 */
public interface SemesterCourse extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link studyprogram.CourseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see studyprogram.CourseType
	 * @see #setType(CourseType)
	 * @see studyprogram.StudyprogramPackage#getSemesterCourse_Type()
	 * @model
	 * @generated
	 */
	CourseType getType();

	/**
	 * Sets the value of the '{@link studyprogram.SemesterCourse#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see studyprogram.CourseType
	 * @see #getType()
	 * @generated
	 */
	void setType(CourseType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyprogram.StudyprogramPackage#getSemesterCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyprogram.SemesterCourse#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyprogram.Semester#getSemesterCourses <em>Semester Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' container reference.
	 * @see #setSemester(Semester)
	 * @see studyprogram.StudyprogramPackage#getSemesterCourse_Semester()
	 * @see studyprogram.Semester#getSemesterCourses
	 * @model opposite="semesterCourses" transient="false"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link studyprogram.SemesterCourse#getSemester <em>Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' container reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference list.
	 * The list contents are of type {@link studyprogram.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference list.
	 * @see studyprogram.StudyprogramPackage#getSemesterCourse_Course()
	 * @model
	 * @generated
	 */
	EList<Course> getCourse();

} // SemesterCourse
