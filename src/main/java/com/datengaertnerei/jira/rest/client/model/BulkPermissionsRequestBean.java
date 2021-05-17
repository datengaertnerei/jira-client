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
import com.datengaertnerei.jira.rest.client.model.BulkProjectPermissions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Details of global permissions to look up and project permissions with associated projects and issues to look up.
 */
@ApiModel(description = "Details of global permissions to look up and project permissions with associated projects and issues to look up.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class BulkPermissionsRequestBean {
  public static final String SERIALIZED_NAME_PROJECT_PERMISSIONS = "projectPermissions";
  @SerializedName(SERIALIZED_NAME_PROJECT_PERMISSIONS)
  private Set<BulkProjectPermissions> projectPermissions = null;

  public static final String SERIALIZED_NAME_GLOBAL_PERMISSIONS = "globalPermissions";
  @SerializedName(SERIALIZED_NAME_GLOBAL_PERMISSIONS)
  private Set<String> globalPermissions = null;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;


  public BulkPermissionsRequestBean projectPermissions(Set<BulkProjectPermissions> projectPermissions) {
    
    this.projectPermissions = projectPermissions;
    return this;
  }

  public BulkPermissionsRequestBean addProjectPermissionsItem(BulkProjectPermissions projectPermissionsItem) {
    if (this.projectPermissions == null) {
      this.projectPermissions = new LinkedHashSet<>();
    }
    this.projectPermissions.add(projectPermissionsItem);
    return this;
  }

   /**
   * Project permissions with associated projects and issues to look up.
   * @return projectPermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Project permissions with associated projects and issues to look up.")

  public Set<BulkProjectPermissions> getProjectPermissions() {
    return projectPermissions;
  }


  public void setProjectPermissions(Set<BulkProjectPermissions> projectPermissions) {
    this.projectPermissions = projectPermissions;
  }


  public BulkPermissionsRequestBean globalPermissions(Set<String> globalPermissions) {
    
    this.globalPermissions = globalPermissions;
    return this;
  }

  public BulkPermissionsRequestBean addGlobalPermissionsItem(String globalPermissionsItem) {
    if (this.globalPermissions == null) {
      this.globalPermissions = new LinkedHashSet<>();
    }
    this.globalPermissions.add(globalPermissionsItem);
    return this;
  }

   /**
   * Global permissions to look up.
   * @return globalPermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Global permissions to look up.")

  public Set<String> getGlobalPermissions() {
    return globalPermissions;
  }


  public void setGlobalPermissions(Set<String> globalPermissions) {
    this.globalPermissions = globalPermissions;
  }


  public BulkPermissionsRequestBean accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID of a user.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account ID of a user.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkPermissionsRequestBean bulkPermissionsRequestBean = (BulkPermissionsRequestBean) o;
    return Objects.equals(this.projectPermissions, bulkPermissionsRequestBean.projectPermissions) &&
        Objects.equals(this.globalPermissions, bulkPermissionsRequestBean.globalPermissions) &&
        Objects.equals(this.accountId, bulkPermissionsRequestBean.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectPermissions, globalPermissions, accountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkPermissionsRequestBean {\n");
    sb.append("    projectPermissions: ").append(toIndentedString(projectPermissions)).append("\n");
    sb.append("    globalPermissions: ").append(toIndentedString(globalPermissions)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
