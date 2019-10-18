/**
 */
package studyprogram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.Year#getValue <em>Value</em>}</li>
 *   <li>{@link studyprogram.Year#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link studyprogram.Year#getStudyPlan <em>Study Plan</em>}</li>
 * </ul>
 *
 * @see studyprogram.StudyprogramPackage#getYear()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='shouldHaveOneFallSemester shouldHaveOneSpringSemester'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 shouldHaveOneFallSemester='aql:self.semesters.type.value -&gt; count(0) == 1' shouldHaveOneSpringSemester='aql:self.semesters.type.value -&gt; count(1) == 1'"
 * @generated
 */
public interface Year extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see studyprogram.StudyprogramPackage#getYear_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link studyprogram.Year#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link studyprogram.Semester}.
	 * It is bidirectional and its opposite is '{@link studyprogram.Semester#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see studyprogram.StudyprogramPackage#getYear_Semesters()
	 * @see studyprogram.Semester#getYear
	 * @model opposite="year" containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Study Plan</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link studyprogram.StudyPlan#getYears <em>Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plan</em>' container reference.
	 * @see #setStudyPlan(StudyPlan)
	 * @see studyprogram.StudyprogramPackage#getYear_StudyPlan()
	 * @see studyprogram.StudyPlan#getYears
	 * @model opposite="years" transient="false"
	 * @generated
	 */
	StudyPlan getStudyPlan();

	/**
	 * Sets the value of the '{@link studyprogram.Year#getStudyPlan <em>Study Plan</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Plan</em>' container reference.
	 * @see #getStudyPlan()
	 * @generated
	 */
	void setStudyPlan(StudyPlan value);

} // Year
