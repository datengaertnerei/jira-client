

# ProjectFeature

Details of a project feature.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**projectId** | **Long** | The ID of the project. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the feature. |  [optional]
**toggleLocked** | **Boolean** | Whether the state of the feature can be updated. |  [optional]
**feature** | **String** | The key of the feature. |  [optional]
**featureCategory** | **String** | The category the feature belongs to. |  [optional]
**prerequisites** | **List&lt;String&gt;** | List of keys of the features required to enable the feature. |  [optional]
**localisedName** | **String** | Localized display name for the feature. |  [optional]
**localisedDescription** | **String** | Localized display description for the feature. |  [optional]
**imageUri** | **String** | URI for the image representing the feature. |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
DISABLED | &quot;DISABLED&quot;
COMING_SOON | &quot;COMING_SOON&quot;



