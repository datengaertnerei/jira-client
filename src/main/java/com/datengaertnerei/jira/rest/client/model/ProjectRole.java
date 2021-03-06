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
import com.datengaertnerei.jira.rest.client.model.RoleActor;
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
import java.util.List;

/**
 * Details about the roles in a project.
 */
@ApiModel(description = "Details about the roles in a project.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class ProjectRole {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ACTORS = "actors";
  @SerializedName(SERIALIZED_NAME_ACTORS)
  private List<RoleActor> actors = null;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private Scope scope;

  public static final String SERIALIZED_NAME_TRANSLATED_NAME = "translatedName";
  @SerializedName(SERIALIZED_NAME_TRANSLATED_NAME)
  private String translatedName;

  public static final String SERIALIZED_NAME_CURRENT_USER_ROLE = "currentUserRole";
  @SerializedName(SERIALIZED_NAME_CURRENT_USER_ROLE)
  private Boolean currentUserRole;

  public static final String SERIALIZED_NAME_ADMIN = "admin";
  @SerializedName(SERIALIZED_NAME_ADMIN)
  private Boolean admin;

  public static final String SERIALIZED_NAME_ROLE_CONFIGURABLE = "roleConfigurable";
  @SerializedName(SERIALIZED_NAME_ROLE_CONFIGURABLE)
  private Boolean roleConfigurable;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;


   /**
   * The URL the project role details.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL the project role details.")

  public URI getSelf() {
    return self;
  }




  public ProjectRole name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the project role.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the project role.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


   /**
   * The ID of the project role.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project role.")

  public Long getId() {
    return id;
  }




   /**
   * The description of the project role.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the project role.")

  public String getDescription() {
    return description;
  }




   /**
   * The list of users who act in this role.
   * @return actors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of users who act in this role.")

  public List<RoleActor> getActors() {
    return actors;
  }




   /**
   * The scope of the role. Indicated for roles associated with [next-gen projects](https://confluence.atlassian.com/x/loMyO).
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The scope of the role. Indicated for roles associated with [next-gen projects](https://confluence.atlassian.com/x/loMyO).")

  public Scope getScope() {
    return scope;
  }




  public ProjectRole translatedName(String translatedName) {
    
    this.translatedName = translatedName;
    return this;
  }

   /**
   * The translated name of the project role.
   * @return translatedName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The translated name of the project role.")

  public String getTranslatedName() {
    return translatedName;
  }


  public void setTranslatedName(String translatedName) {
    this.translatedName = translatedName;
  }


  public ProjectRole currentUserRole(Boolean currentUserRole) {
    
    this.currentUserRole = currentUserRole;
    return this;
  }

   /**
   * Whether the calling user is part of this role.
   * @return currentUserRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the calling user is part of this role.")

  public Boolean getCurrentUserRole() {
    return currentUserRole;
  }


  public void setCurrentUserRole(Boolean currentUserRole) {
    this.currentUserRole = currentUserRole;
  }


   /**
   * Whether this role is the admin role for the project.
   * @return admin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this role is the admin role for the project.")

  public Boolean getAdmin() {
    return admin;
  }




   /**
   * Whether the roles are configurable for this project.
   * @return roleConfigurable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the roles are configurable for this project.")

  public Boolean getRoleConfigurable() {
    return roleConfigurable;
  }




   /**
   * Whether this role is the default role for the project
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this role is the default role for the project")

  public Boolean getDefault() {
    return _default;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectRole projectRole = (ProjectRole) o;
    return Objects.equals(this.self, projectRole.self) &&
        Objects.equals(this.name, projectRole.name) &&
        Objects.equals(this.id, projectRole.id) &&
        Objects.equals(this.description, projectRole.description) &&
        Objects.equals(this.actors, projectRole.actors) &&
        Objects.equals(this.scope, projectRole.scope) &&
        Objects.equals(this.translatedName, projectRole.translatedName) &&
        Objects.equals(this.currentUserRole, projectRole.currentUserRole) &&
        Objects.equals(this.admin, projectRole.admin) &&
        Objects.equals(this.roleConfigurable, projectRole.roleConfigurable) &&
        Objects.equals(this._default, projectRole._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, name, id, description, actors, scope, translatedName, currentUserRole, admin, roleConfigurable, _default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRole {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    actors: ").append(toIndentedString(actors)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    translatedName: ").append(toIndentedString(translatedName)).append("\n");
    sb.append("    currentUserRole: ").append(toIndentedString(currentUserRole)).append("\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    roleConfigurable: ").append(toIndentedString(roleConfigurable)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

