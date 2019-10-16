/**
 */
package studyprogram.util;

import java.util.ArrayList;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import studyprogram.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see studyprogram.StudyprogramPackage
 * @generated
 */
public class StudyprogramValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StudyprogramValidator INSTANCE = new StudyprogramValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "studyprogram";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyprogramValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return StudyprogramPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case StudyprogramPackage.UNIVERSITY:
				return validateUniversity((University)value, diagnostics, context);
			case StudyprogramPackage.DEPARTMENT:
				return validateDepartment((Department)value, diagnostics, context);
			case StudyprogramPackage.PROGRAM:
				return validateProgram((Program)value, diagnostics, context);
			case StudyprogramPackage.STUDY_PLAN:
				return validateStudyPlan((StudyPlan)value, diagnostics, context);
			case StudyprogramPackage.YEAR:
				return validateYear((Year)value, diagnostics, context);
			case StudyprogramPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case StudyprogramPackage.SEMESTER_COURSE:
				return validateSemesterCourse((SemesterCourse)value, diagnostics, context);
			case StudyprogramPackage.SPECIALISATION:
				return validateSpecialisation((Specialisation)value, diagnostics, context);
			case StudyprogramPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case StudyprogramPackage.ELECTIVE_COURSES:
				return validateElectiveCourses((ElectiveCourses)value, diagnostics, context);
			case StudyprogramPackage.OBLIGATORY_COURSES:
				return validateObligatoryCourses((ObligatoryCourses)value, diagnostics, context);
			case StudyprogramPackage.SEMESTER_TYPE:
				return validateSemesterType((SemesterType)value, diagnostics, context);
			case StudyprogramPackage.COURSE_TYPE:
				return validateCourseType((CourseType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(university, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(program, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyPlan(StudyPlan studyPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyPlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYear(Year year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(year, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(year, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(year, diagnostics, context);
		if (result || diagnostics != null) result &= validateYear_shouldHaveOneFallSemester(year, diagnostics, context);
		if (result || diagnostics != null) result &= validateYear_shouldHaveOneSpringSemester(year, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the shouldHaveOneFallSemester constraint of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String YEAR__SHOULD_HAVE_ONE_FALL_SEMESTER__EEXPRESSION = "aql:self.semesters.type.value -> count(0) == 1";

	/**
	 * Validates the shouldHaveOneFallSemester constraint of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYear_shouldHaveOneFallSemester(Year year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyprogramPackage.Literals.YEAR,
				 year,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "shouldHaveOneFallSemester",
				 YEAR__SHOULD_HAVE_ONE_FALL_SEMESTER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the shouldHaveOneSpringSemester constraint of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String YEAR__SHOULD_HAVE_ONE_SPRING_SEMESTER__EEXPRESSION = "aql:self.semesters.type.value -> count(1) == 1";

	/**
	 * Validates the shouldHaveOneSpringSemester constraint of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYear_shouldHaveOneSpringSemester(Year year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StudyprogramPackage.Literals.YEAR,
				 year,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "shouldHaveOneSpringSemester",
				 YEAR__SHOULD_HAVE_ONE_SPRING_SEMESTER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterCourse(SemesterCourse semesterCourse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semesterCourse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semesterCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semesterCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semesterCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semesterCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semesterCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semesterCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semesterCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semesterCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemesterCourse_obligatorySlotShouldOnlyHaveOneCourse(semesterCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemesterCourse_obligatorySlotShouldNotContainElectives(semesterCourse, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemesterCourse_electiveSlotShouldNotContainObligatory(semesterCourse, diagnostics, context);
		return result;
	}

	/**
	 * Validates the obligatorySlotShouldOnlyHaveOneCourse constraint of '<em>Semester Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public boolean validateSemesterCourse_obligatorySlotShouldOnlyHaveOneCourse(SemesterCourse semesterCourse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean isObligatoryCourse = semesterCourse.getType().getLiteral().equals("Obligatory");
		boolean isInvalidList = semesterCourse.getCourse().size() >= 1;
		if (isObligatoryCourse && isInvalidList) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "obligatorySlotShouldOnlyHaveOneCourse", getObjectLabel(semesterCourse, context) },
						 new Object[] { semesterCourse },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the obligatorySlotShouldNotContainElectives constraint of '<em>Semester Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public boolean validateSemesterCourse_obligatorySlotShouldNotContainElectives(SemesterCourse semesterCourse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean isSlotInvalid = false;
		
		EList<Course> slot = semesterCourse.getCourse();
		EList<Course> electives = semesterCourse.getSemester().getYear().getStudyPlan().getProgram().getElectiveCourses().getCourses();
		
		for (Course c : electives) {
			isSlotInvalid = slot.contains(c);
		}
		
		if (isSlotInvalid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "obligatorySlotShouldNotContainElectives", getObjectLabel(semesterCourse, context) },
						 new Object[] { semesterCourse },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the electiveSlotShouldNotContainObligatory constraint of '<em>Semester Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public boolean validateSemesterCourse_electiveSlotShouldNotContainObligatory(SemesterCourse semesterCourse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean isSlotInvalid = false;
		
		EList<Course> slot = semesterCourse.getCourse();
		EList<Course> obligatories = semesterCourse.getSemester().getYear().getStudyPlan().getProgram().getObligatoryCourses().getCourses();
		
		for (Course c : obligatories) {
			isSlotInvalid = slot.contains(c);
		}
		
		if (isSlotInvalid) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "electiveSlotShouldNotContainObligatory", getObjectLabel(semesterCourse, context) },
						 new Object[] { semesterCourse },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialisation(Specialisation specialisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_courseShouldHaveCorrectAmountOfCredits(course, diagnostics, context);
		return result;
	}

	/**
	 * Validates the courseShouldHaveCorrectAmountOfCredits constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public boolean validateCourse_courseShouldHaveCorrectAmountOfCredits(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		ArrayList<Float> validCredits = new ArrayList<Float>();
		validCredits.add((float) 5.0);
		validCredits.add((float) 7.5);
		validCredits.add((float) 10.0);
		
		if (validCredits.contains(course.getCredits())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "courseShouldHaveCorrectAmountOfCredits", getObjectLabel(course, context) },
						 new Object[] { course },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElectiveCourses(ElectiveCourses electiveCourses, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(electiveCourses, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObligatoryCourses(ObligatoryCourses obligatoryCourses, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(obligatoryCourses, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterType(SemesterType semesterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseType(CourseType courseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StudyprogramValidator
