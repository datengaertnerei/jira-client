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
 * Details about a notification event.
 */
@ApiModel(description = "Details about a notification event.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class NotificationEvent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TEMPLATE_EVENT = "templateEvent";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_EVENT)
  private NotificationEvent templateEvent;


  public NotificationEvent id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the event. The event can be a [Jira system event](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or a [custom event](https://confluence.atlassian.com/x/AIlKLg).
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the event. The event can be a [Jira system event](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or a [custom event](https://confluence.atlassian.com/x/AIlKLg).")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public NotificationEvent name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the event.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the event.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NotificationEvent description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the event.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the event.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public NotificationEvent templateEvent(NotificationEvent templateEvent) {
    
    this.templateEvent = templateEvent;
    return this;
  }

   /**
   * The template of the event. Only custom events configured by Jira administrators have template.
   * @return templateEvent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The template of the event. Only custom events configured by Jira administrators have template.")

  public NotificationEvent getTemplateEvent() {
    return templateEvent;
  }


  public void setTemplateEvent(NotificationEvent templateEvent) {
    this.templateEvent = templateEvent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationEvent notificationEvent = (NotificationEvent) o;
    return Objects.equals(this.id, notificationEvent.id) &&
        Objects.equals(this.name, notificationEvent.name) &&
        Objects.equals(this.description, notificationEvent.description) &&
        Objects.equals(this.templateEvent, notificationEvent.templateEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, templateEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    templateEvent: ").append(toIndentedString(templateEvent)).append("\n");
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
