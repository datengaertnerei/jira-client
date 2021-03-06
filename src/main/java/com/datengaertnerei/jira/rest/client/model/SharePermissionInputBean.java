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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SharePermissionInputBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class SharePermissionInputBean {
  /**
   * The type of the share permission.Specify the type as follows:   *  &#x60;group&#x60; Share with a group. Specify &#x60;groupname&#x60; as well.  *  &#x60;project&#x60; Share with a project. Specify &#x60;projectId&#x60; as well.  *  &#x60;projectRole&#x60; Share with a project role in a project. Specify &#x60;projectId&#x60; and &#x60;projectRoleId&#x60; as well.  *  &#x60;global&#x60; Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  &#x60;authenticated&#x60; Share with all logged-in users. This shows as &#x60;loggedin&#x60; in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PROJECT("project"),
    
    GROUP("group"),
    
    PROJECTROLE("projectRole"),
    
    GLOBAL("global"),
    
    AUTHENTICATED("authenticated");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_GROUPNAME = "groupname";
  @SerializedName(SERIALIZED_NAME_GROUPNAME)
  private String groupname;

  public static final String SERIALIZED_NAME_PROJECT_ROLE_ID = "projectRoleId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ROLE_ID)
  private String projectRoleId;


  public SharePermissionInputBean type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the share permission.Specify the type as follows:   *  &#x60;group&#x60; Share with a group. Specify &#x60;groupname&#x60; as well.  *  &#x60;project&#x60; Share with a project. Specify &#x60;projectId&#x60; as well.  *  &#x60;projectRole&#x60; Share with a project role in a project. Specify &#x60;projectId&#x60; and &#x60;projectRoleId&#x60; as well.  *  &#x60;global&#x60; Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  &#x60;authenticated&#x60; Share with all logged-in users. This shows as &#x60;loggedin&#x60; in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the share permission.Specify the type as follows:   *  `group` Share with a group. Specify `groupname` as well.  *  `project` Share with a project. Specify `projectId` as well.  *  `projectRole` Share with a project role in a project. Specify `projectId` and `projectRoleId` as well.  *  `global` Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  `authenticated` Share with all logged-in users. This shows as `loggedin` in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public SharePermissionInputBean projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project to share the filter with. Set &#x60;type&#x60; to &#x60;project&#x60;.
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project to share the filter with. Set `type` to `project`.")

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public SharePermissionInputBean groupname(String groupname) {
    
    this.groupname = groupname;
    return this;
  }

   /**
   * The name of the group to share the filter with. Set &#x60;type&#x60; to &#x60;group&#x60;.
   * @return groupname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the group to share the filter with. Set `type` to `group`.")

  public String getGroupname() {
    return groupname;
  }


  public void setGroupname(String groupname) {
    this.groupname = groupname;
  }


  public SharePermissionInputBean projectRoleId(String projectRoleId) {
    
    this.projectRoleId = projectRoleId;
    return this;
  }

   /**
   * The ID of the project role to share the filter with. Set &#x60;type&#x60; to &#x60;projectRole&#x60; and the &#x60;projectId&#x60; for the project that the role is in.
   * @return projectRoleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project role to share the filter with. Set `type` to `projectRole` and the `projectId` for the project that the role is in.")

  public String getProjectRoleId() {
    return projectRoleId;
  }


  public void setProjectRoleId(String projectRoleId) {
    this.projectRoleId = projectRoleId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharePermissionInputBean sharePermissionInputBean = (SharePermissionInputBean) o;
    return Objects.equals(this.type, sharePermissionInputBean.type) &&
        Objects.equals(this.projectId, sharePermissionInputBean.projectId) &&
        Objects.equals(this.groupname, sharePermissionInputBean.groupname) &&
        Objects.equals(this.projectRoleId, sharePermissionInputBean.projectRoleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, projectId, groupname, projectRoleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharePermissionInputBean {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    groupname: ").append(toIndentedString(groupname)).append("\n");
    sb.append("    projectRoleId: ").append(toIndentedString(projectRoleId)).append("\n");
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

