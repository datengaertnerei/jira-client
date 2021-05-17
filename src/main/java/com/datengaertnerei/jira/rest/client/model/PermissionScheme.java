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
import com.datengaertnerei.jira.rest.client.model.PermissionGrant;
import com.datengaertnerei.jira.rest.client.model.Scope;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Details of a permission scheme.
 */
@ApiModel(description = "Details of a permission scheme.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class PermissionScheme extends HashMap<String, Object> {
  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private String expand;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private Scope scope;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<PermissionGrant> permissions = null;


   /**
   * The expand options available for the permission scheme.
   * @return expand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The expand options available for the permission scheme.")

  public String getExpand() {
    return expand;
  }




   /**
   * The ID of the permission scheme.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the permission scheme.")

  public Long getId() {
    return id;
  }




   /**
   * The URL of the permission scheme.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the permission scheme.")

  public URI getSelf() {
    return self;
  }




  public PermissionScheme name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the permission scheme. Must be unique.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the permission scheme. Must be unique.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PermissionScheme description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description for the permission scheme.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description for the permission scheme.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PermissionScheme scope(Scope scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the permission scheme.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The scope of the permission scheme.")

  public Scope getScope() {
    return scope;
  }


  public void setScope(Scope scope) {
    this.scope = scope;
  }


  public PermissionScheme permissions(List<PermissionGrant> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public PermissionScheme addPermissionsItem(PermissionGrant permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * The permission scheme to create or update. See [About permission schemes and grants](../api-group-permission-schemes/#about-permission-schemes-and-grants) for more information.
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The permission scheme to create or update. See [About permission schemes and grants](../api-group-permission-schemes/#about-permission-schemes-and-grants) for more information.")

  public List<PermissionGrant> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<PermissionGrant> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionScheme permissionScheme = (PermissionScheme) o;
    return Objects.equals(this.expand, permissionScheme.expand) &&
        Objects.equals(this.id, permissionScheme.id) &&
        Objects.equals(this.self, permissionScheme.self) &&
        Objects.equals(this.name, permissionScheme.name) &&
        Objects.equals(this.description, permissionScheme.description) &&
        Objects.equals(this.scope, permissionScheme.scope) &&
        Objects.equals(this.permissions, permissionScheme.permissions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, id, self, name, description, scope, permissions, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionScheme {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

