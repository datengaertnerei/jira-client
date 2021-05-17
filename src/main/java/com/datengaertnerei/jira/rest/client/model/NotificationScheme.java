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
import com.datengaertnerei.jira.rest.client.model.NotificationSchemeEvent;
import com.datengaertnerei.jira.rest.client.model.Scope;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Details about a notification scheme.
 */
@ApiModel(description = "Details about a notification scheme.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class NotificationScheme {
  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private String expand;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private String self;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NOTIFICATION_SCHEME_EVENTS = "notificationSchemeEvents";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_SCHEME_EVENTS)
  private List<NotificationSchemeEvent> notificationSchemeEvents = null;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private Scope scope;


  public NotificationScheme expand(String expand) {
    
    this.expand = expand;
    return this;
  }

   /**
   * Expand options that include additional notification scheme details in the response.
   * @return expand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expand options that include additional notification scheme details in the response.")

  public String getExpand() {
    return expand;
  }


  public void setExpand(String expand) {
    this.expand = expand;
  }


  public NotificationScheme id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the notification scheme.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the notification scheme.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public NotificationScheme self(String self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSelf() {
    return self;
  }


  public void setSelf(String self) {
    this.self = self;
  }


  public NotificationScheme name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the notification scheme.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the notification scheme.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NotificationScheme description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the notification scheme.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the notification scheme.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public NotificationScheme notificationSchemeEvents(List<NotificationSchemeEvent> notificationSchemeEvents) {
    
    this.notificationSchemeEvents = notificationSchemeEvents;
    return this;
  }

  public NotificationScheme addNotificationSchemeEventsItem(NotificationSchemeEvent notificationSchemeEventsItem) {
    if (this.notificationSchemeEvents == null) {
      this.notificationSchemeEvents = new ArrayList<>();
    }
    this.notificationSchemeEvents.add(notificationSchemeEventsItem);
    return this;
  }

   /**
   * The notification events and associated recipients.
   * @return notificationSchemeEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The notification events and associated recipients.")

  public List<NotificationSchemeEvent> getNotificationSchemeEvents() {
    return notificationSchemeEvents;
  }


  public void setNotificationSchemeEvents(List<NotificationSchemeEvent> notificationSchemeEvents) {
    this.notificationSchemeEvents = notificationSchemeEvents;
  }


  public NotificationScheme scope(Scope scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the notification scheme.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The scope of the notification scheme.")

  public Scope getScope() {
    return scope;
  }


  public void setScope(Scope scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationScheme notificationScheme = (NotificationScheme) o;
    return Objects.equals(this.expand, notificationScheme.expand) &&
        Objects.equals(this.id, notificationScheme.id) &&
        Objects.equals(this.self, notificationScheme.self) &&
        Objects.equals(this.name, notificationScheme.name) &&
        Objects.equals(this.description, notificationScheme.description) &&
        Objects.equals(this.notificationSchemeEvents, notificationScheme.notificationSchemeEvents) &&
        Objects.equals(this.scope, notificationScheme.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, id, self, name, description, notificationSchemeEvents, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationScheme {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notificationSchemeEvents: ").append(toIndentedString(notificationSchemeEvents)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

