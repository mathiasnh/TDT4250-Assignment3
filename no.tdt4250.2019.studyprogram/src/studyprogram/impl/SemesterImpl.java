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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import studyprogram.Semester;
import studyprogram.SemesterCourse;
import studyprogram.SemesterType;
import studyprogram.StudyprogramPackage;
import studyprogram.Year;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.impl.SemesterImpl#getType <em>Type</em>}</li>
 *   <li>{@link studyprogram.impl.SemesterImpl#getYear <em>Year</em>}</li>
 *   <li>{@link studyprogram.impl.SemesterImpl#getSemesterCourses <em>Semester Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SemesterType TYPE_EDEFAULT = SemesterType.FALL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SemesterType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemesterCourses() <em>Semester Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<SemesterCourse> semesterCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SemesterType newType) {
		SemesterType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.SEMESTER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Year getYear() {
		if (eContainerFeatureID() != StudyprogramPackage.SEMESTER__YEAR) return null;
		return (Year)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYear(Year newYear, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newYear, StudyprogramPackage.SEMESTER__YEAR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(Year newYear) {
		if (newYear != eInternalContainer() || (eContainerFeatureID() != StudyprogramPackage.SEMESTER__YEAR && newYear != null)) {
			if (EcoreUtil.isAncestor(this, newYear))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newYear != null)
				msgs = ((InternalEObject)newYear).eInverseAdd(this, StudyprogramPackage.YEAR__SEMESTERS, Year.class, msgs);
			msgs = basicSetYear(newYear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.SEMESTER__YEAR, newYear, newYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemesterCourse> getSemesterCourses() {
		if (semesterCourses == null) {
			semesterCourses = new EObjectContainmentWithInverseEList<SemesterCourse>(SemesterCourse.class, this, StudyprogramPackage.SEMESTER__SEMESTER_COURSES, StudyprogramPackage.SEMESTER_COURSE__SEMESTER);
		}
		return semesterCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogramPackage.SEMESTER__YEAR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetYear((Year)otherEnd, msgs);
			case StudyprogramPackage.SEMESTER__SEMESTER_COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemesterCourses()).basicAdd(otherEnd, msgs);
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
			case StudyprogramPackage.SEMESTER__YEAR:
				return basicSetYear(null, msgs);
			case StudyprogramPackage.SEMESTER__SEMESTER_COURSES:
				return ((InternalEList<?>)getSemesterCourses()).basicRemove(otherEnd, msgs);
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
			case StudyprogramPackage.SEMESTER__YEAR:
				return eInternalContainer().eInverseRemove(this, StudyprogramPackage.YEAR__SEMESTERS, Year.class, msgs);
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
			case StudyprogramPackage.SEMESTER__TYPE:
				return getType();
			case StudyprogramPackage.SEMESTER__YEAR:
				return getYear();
			case StudyprogramPackage.SEMESTER__SEMESTER_COURSES:
				return getSemesterCourses();
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
			case StudyprogramPackage.SEMESTER__TYPE:
				setType((SemesterType)newValue);
				return;
			case StudyprogramPackage.SEMESTER__YEAR:
				setYear((Year)newValue);
				return;
			case StudyprogramPackage.SEMESTER__SEMESTER_COURSES:
				getSemesterCourses().clear();
				getSemesterCourses().addAll((Collection<? extends SemesterCourse>)newValue);
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
			case StudyprogramPackage.SEMESTER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case StudyprogramPackage.SEMESTER__YEAR:
				setYear((Year)null);
				return;
			case StudyprogramPackage.SEMESTER__SEMESTER_COURSES:
				getSemesterCourses().clear();
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
			case StudyprogramPackage.SEMESTER__TYPE:
				return type != TYPE_EDEFAULT;
			case StudyprogramPackage.SEMESTER__YEAR:
				return getYear() != null;
			case StudyprogramPackage.SEMESTER__SEMESTER_COURSES:
				return semesterCourses != null && !semesterCourses.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
