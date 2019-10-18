/**
 */
package studyprogram.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import studyprogram.Course;
import studyprogram.CourseType;
import studyprogram.Semester;
import studyprogram.SemesterCourse;
import studyprogram.StudyprogramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.impl.SemesterCourseImpl#getType <em>Type</em>}</li>
 *   <li>{@link studyprogram.impl.SemesterCourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyprogram.impl.SemesterCourseImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link studyprogram.impl.SemesterCourseImpl#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterCourseImpl extends MinimalEObjectImpl.Container implements SemesterCourse {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CourseType TYPE_EDEFAULT = CourseType.OBLIGATORY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CourseType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> course;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterCourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramPackage.Literals.SEMESTER_COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CourseType newType) {
		CourseType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.SEMESTER_COURSE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.SEMESTER_COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester getSemester() {
		if (eContainerFeatureID() != StudyprogramPackage.SEMESTER_COURSE__SEMESTER) return null;
		return (Semester)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemester(Semester newSemester, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSemester, StudyprogramPackage.SEMESTER_COURSE__SEMESTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemester(Semester newSemester) {
		if (newSemester != eInternalContainer() || (eContainerFeatureID() != StudyprogramPackage.SEMESTER_COURSE__SEMESTER && newSemester != null)) {
			if (EcoreUtil.isAncestor(this, newSemester))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSemester != null)
				msgs = ((InternalEObject)newSemester).eInverseAdd(this, StudyprogramPackage.SEMESTER__SEMESTER_COURSES, Semester.class, msgs);
			msgs = basicSetSemester(newSemester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.SEMESTER_COURSE__SEMESTER, newSemester, newSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourse() {
		if (course == null) {
			course = new EObjectResolvingEList<Course>(Course.class, this, StudyprogramPackage.SEMESTER_COURSE__COURSE);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogramPackage.SEMESTER_COURSE__SEMESTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSemester((Semester)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogramPackage.SEMESTER_COURSE__SEMESTER:
				return basicSetSemester(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StudyprogramPackage.SEMESTER_COURSE__SEMESTER:
				return eInternalContainer().eInverseRemove(this, StudyprogramPackage.SEMESTER__SEMESTER_COURSES, Semester.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyprogramPackage.SEMESTER_COURSE__TYPE:
				return getType();
			case StudyprogramPackage.SEMESTER_COURSE__NAME:
				return getName();
			case StudyprogramPackage.SEMESTER_COURSE__SEMESTER:
				return getSemester();
			case StudyprogramPackage.SEMESTER_COURSE__COURSE:
				return getCourse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyprogramPackage.SEMESTER_COURSE__TYPE:
				setType((CourseType)newValue);
				return;
			case StudyprogramPackage.SEMESTER_COURSE__NAME:
				setName((String)newValue);
				return;
			case StudyprogramPackage.SEMESTER_COURSE__SEMESTER:
				setSemester((Semester)newValue);
				return;
			case StudyprogramPackage.SEMESTER_COURSE__COURSE:
				getCourse().clear();
				getCourse().addAll((Collection<? extends Course>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudyprogramPackage.SEMESTER_COURSE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case StudyprogramPackage.SEMESTER_COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyprogramPackage.SEMESTER_COURSE__SEMESTER:
				setSemester((Semester)null);
				return;
			case StudyprogramPackage.SEMESTER_COURSE__COURSE:
				getCourse().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudyprogramPackage.SEMESTER_COURSE__TYPE:
				return type != TYPE_EDEFAULT;
			case StudyprogramPackage.SEMESTER_COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyprogramPackage.SEMESTER_COURSE__SEMESTER:
				return getSemester() != null;
			case StudyprogramPackage.SEMESTER_COURSE__COURSE:
				return course != null && !course.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SemesterCourseImpl
