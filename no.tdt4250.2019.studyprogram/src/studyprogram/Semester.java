/**
 */
package studyprogram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.Semester#getType <em>Type</em>}</li>
 *   <li>{@link studyprogram.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link studyprogram.Semester#getSemesterCourses <em>Semester Courses</em>}</li>
 * </ul>
 *
 * @see studyprogram.StudyprogramPackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link studyprogram.SemesterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see studyprogram.SemesterType
	 * @see #setType(SemesterType)
	 * @see studyprogram.StudyprogramPackage#getSemester_Type()
	 * @model
	 * @generated
	 */
	SemesterType getType();

	/**
	 * Sets the value of the '{@link studyprogram.Semester#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see studyprogram.SemesterType
	 * @see #getType()
	 * @generated
	 */
	void setType(SemesterType value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyprogram.Year#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' container reference.
	 * @see #setYear(Year)
	 * @see studyprogram.StudyprogramPackage#getSemester_Year()
	 * @see studyprogram.Year#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	Year getYear();

	/**
	 * Sets the value of the '{@link studyprogram.Semester#getYear <em>Year</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' container reference.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(Year value);

	/**
	 * Returns the value of the '<em><b>Semester Courses</b></em>' containment reference list.
	 * The list contents are of type {@link studyprogram.SemesterCourse}.
	 * It is bidirectional and its opposite is '{@link studyprogram.SemesterCourse#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Courses</em>' containment reference list.
	 * @see studyprogram.StudyprogramPackage#getSemester_SemesterCourses()
	 * @see studyprogram.SemesterCourse#getSemester
	 * @model opposite="semester" containment="true"
	 * @generated
	 */
	EList<SemesterCourse> getSemesterCourses();

} // Semester
