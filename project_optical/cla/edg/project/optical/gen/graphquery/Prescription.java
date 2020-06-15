package cla.edg.project.optical.gen.graphquery;

import java.util.Map;

import cla.edg.modelbean.*;

public class Prescription extends BaseModelBean {
  public String getFullClassName() {
    return "com.doublechaintech.optical.prescription.Prescription";
  }
  // 枚举对象

  // 引用的对象

  public AgeRange ageRange() {
    AgeRange member = new AgeRange();
    member.setModelTypeName("age_range");
    member.setName("age_range");
    member.setMemberName("ageRange");
    member.setReferDirection(true);
    member.setRelationName("ageRange");
    append(member);
    return member;
  }

  public ReminderFrequencyType reminderFrequencyType() {
    ReminderFrequencyType member = new ReminderFrequencyType();
    member.setModelTypeName("reminder_frequency_type");
    member.setName("reminder_frequency_type");
    member.setMemberName("reminderFrequencyType");
    member.setReferDirection(true);
    member.setRelationName("reminderFrequencyType");
    append(member);
    return member;
  }

  public PrescriptionPdType prescriptionPdType() {
    PrescriptionPdType member = new PrescriptionPdType();
    member.setModelTypeName("prescription_pd_type");
    member.setName("prescription_pd_type");
    member.setMemberName("prescriptionPdType");
    member.setReferDirection(true);
    member.setRelationName("prescriptionPdType");
    append(member);
    return member;
  }

  public HorizontalBaseDirection rightPrismHorizontalBaseDirection() {
    HorizontalBaseDirection member = new HorizontalBaseDirection();
    member.setModelTypeName("horizontal_base_direction");
    member.setName("right_prism_horizontal_base_direction");
    member.setMemberName("rightPrismHorizontalBaseDirection");
    member.setReferDirection(true);
    member.setRelationName("rightPrismHorizontalBaseDirection");
    append(member);
    return member;
  }

  public VerticalBaseDirection rightPrismVerticalBaseDirection() {
    VerticalBaseDirection member = new VerticalBaseDirection();
    member.setModelTypeName("vertical_base_direction");
    member.setName("right_prism_vertical_base_direction");
    member.setMemberName("rightPrismVerticalBaseDirection");
    member.setReferDirection(true);
    member.setRelationName("rightPrismVerticalBaseDirection");
    append(member);
    return member;
  }

  public HorizontalBaseDirection leftPrismHorizontalBaseDirection() {
    HorizontalBaseDirection member = new HorizontalBaseDirection();
    member.setModelTypeName("horizontal_base_direction");
    member.setName("left_prism_horizontal_base_direction");
    member.setMemberName("leftPrismHorizontalBaseDirection");
    member.setReferDirection(true);
    member.setRelationName("leftPrismHorizontalBaseDirection");
    append(member);
    return member;
  }

  public VerticalBaseDirection leftPrismVerticalBaseDirection() {
    VerticalBaseDirection member = new VerticalBaseDirection();
    member.setModelTypeName("vertical_base_direction");
    member.setName("left_prism_vertical_base_direction");
    member.setMemberName("leftPrismVerticalBaseDirection");
    member.setReferDirection(true);
    member.setRelationName("leftPrismVerticalBaseDirection");
    append(member);
    return member;
  }

  public User user() {
    User member = new User();
    member.setModelTypeName("user");
    member.setName("user");
    member.setMemberName("user");
    member.setReferDirection(true);
    member.setRelationName("user");
    append(member);
    return member;
  }

  // 被引用的对象

  public LineItem lineItemList() {
    LineItem member = new LineItem();
    member.setModelTypeName("line_item");
    member.setName("prescription");
    member.setMemberName("lineItemList");
    member.setRelationName("prescription");
    member.setReferDirection(false);
    append(member);
    return member;
  }

  // 普通属性

  public StringAttribute id() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("id");
    member.setName("id");
    useMember(member);
    return member;
  }

  public StringAttribute name() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string");
    // member.setName("name");
    member.setName("name");
    useMember(member);
    return member;
  }

  public DateTimeAttribute diagnosisDate() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date");
    // member.setName("diagnosisDate");
    member.setName("diagnosis_date");
    useMember(member);
    return member;
  }

  public NumberAttribute singlePupillaryDistanceValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("singlePupillaryDistanceValue");
    member.setName("single_pupillary_distance_value");
    useMember(member);
    return member;
  }

  public NumberAttribute leftPupillaryDistanceValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("leftPupillaryDistanceValue");
    member.setName("left_pupillary_distance_value");
    useMember(member);
    return member;
  }

  public NumberAttribute rightPupillaryDistanceValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("rightPupillaryDistanceValue");
    member.setName("right_pupillary_distance_value");
    useMember(member);
    return member;
  }

  public NumberAttribute rightSphere() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("rightSphere");
    member.setName("right_sphere");
    useMember(member);
    return member;
  }

  public NumberAttribute rightCylinder() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("rightCylinder");
    member.setName("right_cylinder");
    useMember(member);
    return member;
  }

  public NumberAttribute rightAxis() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("rightAxis");
    member.setName("right_axis");
    useMember(member);
    return member;
  }

  public NumberAttribute leftSphere() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("leftSphere");
    member.setName("left_sphere");
    useMember(member);
    return member;
  }

  public NumberAttribute leftCylinder() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("leftCylinder");
    member.setName("left_cylinder");
    useMember(member);
    return member;
  }

  public NumberAttribute leftAxis() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("leftAxis");
    member.setName("left_axis");
    useMember(member);
    return member;
  }

  public BooleanAttribute isPrism() {
    BooleanAttribute member = new BooleanAttribute();
    member.setModelTypeName("bool");
    // member.setName("isPrism");
    member.setName("is_prism");
    useMember(member);
    return member;
  }

  public NumberAttribute rightPrismHorizontalValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("rightPrismHorizontalValue");
    member.setName("right_prism_horizontal_value");
    useMember(member);
    return member;
  }

  public NumberAttribute rightPrismVerticalValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("rightPrismVerticalValue");
    member.setName("right_prism_vertical_value");
    useMember(member);
    return member;
  }

  public NumberAttribute leftPrismHorizontalValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("leftPrismHorizontalValue");
    member.setName("left_prism_horizontal_value");
    useMember(member);
    return member;
  }

  public NumberAttribute leftPrismVerticalValue() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("double");
    // member.setName("leftPrismVerticalValue");
    member.setName("left_prism_vertical_value");
    useMember(member);
    return member;
  }

  public DateTimeAttribute createTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_create");
    // member.setName("createTime");
    member.setName("create_time");
    useMember(member);
    return member;
  }

  public DateTimeAttribute lastUpdateTime() {
    DateTimeAttribute member = new DateTimeAttribute();
    member.setModelTypeName("date_time_update");
    // member.setName("lastUpdateTime");
    member.setName("last_update_time");
    useMember(member);
    return member;
  }

  public StringAttribute prescriptionImage() {
    StringAttribute member = new StringAttribute();
    member.setModelTypeName("string_image");
    // member.setName("prescriptionImage");
    member.setName("prescription_image");
    useMember(member);
    return member;
  }

  public NumberAttribute version() {
    NumberAttribute member = new NumberAttribute();
    member.setModelTypeName("int");
    // member.setName("version");
    member.setName("version");
    useMember(member);
    return member;
  }
}
