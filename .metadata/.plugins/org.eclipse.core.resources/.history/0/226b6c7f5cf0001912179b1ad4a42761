/**
 */
package studyprogram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import studyprogram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyprogramFactoryImpl extends EFactoryImpl implements StudyprogramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StudyprogramFactory init() {
		try {
			StudyprogramFactory theStudyprogramFactory = (StudyprogramFactory)EPackage.Registry.INSTANCE.getEFactory(StudyprogramPackage.eNS_URI);
			if (theStudyprogramFactory != null) {
				return theStudyprogramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StudyprogramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyprogramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StudyprogramPackage.UNIVERSITY: return createUniversity();
			case StudyprogramPackage.DEPARTMENT: return createDepartment();
			case StudyprogramPackage.PROGRAM: return createProgram();
			case StudyprogramPackage.STUDY_PLAN: return createStudyPlan();
			case StudyprogramPackage.YEAR: return createYear();
			case StudyprogramPackage.SEMESTER: return createSemester();
			case StudyprogramPackage.SEMESTER_COURSE: return createSemesterCourse();
			case StudyprogramPackage.SPECIALISATION: return createSpecialisation();
			case StudyprogramPackage.COURSE: return createCourse();
			case StudyprogramPackage.ELECTIVE_COURSES: return createElectiveCourses();
			case StudyprogramPackage.OBLIGATORY_COURSES: return createObligatoryCourses();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StudyprogramPackage.SEMESTER_TYPE:
				return createSemesterTypeFromString(eDataType, initialValue);
			case StudyprogramPackage.COURSE_TYPE:
				return createCourseTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StudyprogramPackage.SEMESTER_TYPE:
				return convertSemesterTypeToString(eDataType, instanceValue);
			case StudyprogramPackage.COURSE_TYPE:
				return convertCourseTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public University createUniversity() {
		UniversityImpl university = new UniversityImpl();
		return university;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department createDepartment() {
		DepartmentImpl department = new DepartmentImpl();
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyPlan createStudyPlan() {
		StudyPlanImpl studyPlan = new StudyPlanImpl();
		return studyPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Year createYear() {
		YearImpl year = new YearImpl();
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester createSemester() {
		SemesterImpl semester = new SemesterImpl();
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterCourse createSemesterCourse() {
		SemesterCourseImpl semesterCourse = new SemesterCourseImpl();
		return semesterCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialisation createSpecialisation() {
		SpecialisationImpl specialisation = new SpecialisationImpl();
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectiveCourses createElectiveCourses() {
		ElectiveCoursesImpl electiveCourses = new ElectiveCoursesImpl();
		return electiveCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObligatoryCourses createObligatoryCourses() {
		ObligatoryCoursesImpl obligatoryCourses = new ObligatoryCoursesImpl();
		return obligatoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterType createSemesterTypeFromString(EDataType eDataType, String initialValue) {
		SemesterType result = SemesterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSemesterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseType createCourseTypeFromString(EDataType eDataType, String initialValue) {
		CourseType result = CourseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCourseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyprogramPackage getStudyprogramPackage() {
		return (StudyprogramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StudyprogramPackage getPackage() {
		return StudyprogramPackage.eINSTANCE;
	}

} //StudyprogramFactoryImpl
