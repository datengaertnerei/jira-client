/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datengaertnerei.jira.rest.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datengaertnerei.jira.rest.client.model.FieldDetails;
import com.datengaertnerei.jira.rest.client.model.GroupName;
import com.datengaertnerei.jira.rest.client.model.ProjectRole;
import com.datengaertnerei.jira.rest.client.model.UserDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Details about a notification associated with an event.
 */
@ApiModel(description = "Details about a notification associated with an event.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class EventNotification {
  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private String expand;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  /**
   * Identifies the recipients of the notification.
   */
  @JsonAdapter(NotificationTypeEnum.Adapter.class)
  public enum NotificationTypeEnum {
    CURRENTASSIGNEE("CurrentAssignee"),
    
    REPORTER("Reporter"),
    
    CURRENTUSER("CurrentUser"),
    
    PROJECTLEAD("ProjectLead"),
    
    COMPONENTLEAD("ComponentLead"),
    
    USER("User"),
    
    GROUP("Group"),
    
    PROJECTROLE("ProjectRole"),
    
    EMAILADDRESS("EmailAddress"),
    
    ALLWATCHERS("AllWatchers"),
    
    USERCUSTOMFIELD("UserCustomField"),
    
    GROUPCUSTOMFIELD("GroupCustomField");

    private String value;

    NotificationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotificationTypeEnum fromValue(String value) {
      for (NotificationTypeEnum b : NotificationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NotificationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NotificationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NotificationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NotificationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NOTIFICATION_TYPE = "notificationType";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TYPE)
  private NotificationTypeEnum notificationType;

  public static final String SERIALIZED_NAME_PARAMETER = "parameter";
  @SerializedName(SERIALIZED_NAME_PARAMETER)
  private String parameter;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private GroupName group;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private FieldDetails field;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_PROJECT_ROLE = "projectRole";
  @SerializedName(SERIALIZED_NAME_PROJECT_ROLE)
  private ProjectRole projectRole;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UserDetails user;


  public EventNotification expand(String expand) {
    
    this.expand = expand;
    return this;
  }

   /**
   * Expand options that include additional event notification details in the response.
   * @return expand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expand options that include additional event notification details in the response.")

  public String getExpand() {
    return expand;
  }


  public void setExpand(String expand) {
    this.expand = expand;
  }


  public EventNotification id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the notification.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the notification.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public EventNotification notificationType(NotificationTypeEnum notificationType) {
    
    this.notificationType = notificationType;
    return this;
  }

   /**
   * Identifies the recipients of the notification.
   * @return notificationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the recipients of the notification.")

  public NotificationTypeEnum getNotificationType() {
    return notificationType;
  }


  public void setNotificationType(NotificationTypeEnum notificationType) {
    this.notificationType = notificationType;
  }


  public EventNotification parameter(String parameter) {
    
    this.parameter = parameter;
    return this;
  }

   /**
   * The value of the &#x60;notificationType&#x60;:   *  &#x60;User&#x60; The &#x60;parameter&#x60; is the user account ID.  *  &#x60;Group&#x60; The &#x60;parameter&#x60; is the group name.  *  &#x60;ProjectRole&#x60; The &#x60;parameter&#x60; is the project role ID.  *  &#x60;UserCustomField&#x60; The &#x60;parameter&#x60; is the ID of the custom field.  *  &#x60;GroupCustomField&#x60; The &#x60;parameter&#x60; is the ID of the custom field.
   * @return parameter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the `notificationType`:   *  `User` The `parameter` is the user account ID.  *  `Group` The `parameter` is the group name.  *  `ProjectRole` The `parameter` is the project role ID.  *  `UserCustomField` The `parameter` is the ID of the custom field.  *  `GroupCustomField` The `parameter` is the ID of the custom field.")

  public String getParameter() {
    return parameter;
  }


  public void setParameter(String parameter) {
    this.parameter = parameter;
  }


  public EventNotification group(GroupName group) {
    
    this.group = group;
    return this;
  }

   /**
   * The specified group.
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The specified group.")

  public GroupName getGroup() {
    return group;
  }


  public void setGroup(GroupName group) {
    this.group = group;
  }


  public EventNotification field(FieldDetails field) {
    
    this.field = field;
    return this;
  }

   /**
   * The custom user or group field.
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The custom user or group field.")

  public FieldDetails getField() {
    return field;
  }


  public void setField(FieldDetails field) {
    this.field = field;
  }


  public EventNotification emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address.")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public EventNotification projectRole(ProjectRole projectRole) {
    
    this.projectRole = projectRole;
    return this;
  }

   /**
   * The specified project role.
   * @return projectRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The specified project role.")

  public ProjectRole getProjectRole() {
    return projectRole;
  }


  public void setProjectRole(ProjectRole projectRole) {
    this.projectRole = projectRole;
  }


  public EventNotification user(UserDetails user) {
    
    this.user = user;
    return this;
  }

   /**
   * The specified user.
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The specified user.")

  public UserDetails getUser() {
    return user;
  }


  public void setUser(UserDetails user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventNotification eventNotification = (EventNotification) o;
    return Objects.equals(this.expand, eventNotification.expand) &&
        Objects.equals(this.id, eventNotification.id) &&
        Objects.equals(this.notificationType, eventNotification.notificationType) &&
        Objects.equals(this.parameter, eventNotification.parameter) &&
        Objects.equals(this.group, eventNotification.group) &&
        Objects.equals(this.field, eventNotification.field) &&
        Objects.equals(this.emailAddress, eventNotification.emailAddress) &&
        Objects.equals(this.projectRole, eventNotification.projectRole) &&
        Objects.equals(this.user, eventNotification.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, id, notificationType, parameter, group, field, emailAddress, projectRole, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventNotification {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    projectRole: ").append(toIndentedString(projectRole)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

