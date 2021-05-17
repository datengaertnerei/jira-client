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


package com.datengaertnerei.jira.rest.client.api;

import com.datengaertnerei.jira.rest.client.ApiCallback;
import com.datengaertnerei.jira.rest.client.ApiClient;
import com.datengaertnerei.jira.rest.client.ApiException;
import com.datengaertnerei.jira.rest.client.ApiResponse;
import com.datengaertnerei.jira.rest.client.Configuration;
import com.datengaertnerei.jira.rest.client.Pair;
import com.datengaertnerei.jira.rest.client.ProgressRequestBody;
import com.datengaertnerei.jira.rest.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.datengaertnerei.jira.rest.client.model.Priority;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IssuePrioritiesApi {
    private ApiClient localVarApiClient;

    public IssuePrioritiesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IssuePrioritiesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getPriorities
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPrioritiesCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/api/3/priority";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPrioritiesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getPrioritiesCall(_callback);
        return localVarCall;

    }

    /**
     * Get priorities
     * Returns the list of all issue priorities.  **[Permissions](#permissions) required:** Permission to access Jira.
     * @return List&lt;Priority&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public List<Priority> getPriorities() throws ApiException {
        ApiResponse<List<Priority>> localVarResp = getPrioritiesWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get priorities
     * Returns the list of all issue priorities.  **[Permissions](#permissions) required:** Permission to access Jira.
     * @return ApiResponse&lt;List&lt;Priority&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Priority>> getPrioritiesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getPrioritiesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<Priority>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get priorities (asynchronously)
     * Returns the list of all issue priorities.  **[Permissions](#permissions) required:** Permission to access Jira.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPrioritiesAsync(final ApiCallback<List<Priority>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPrioritiesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<Priority>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPriority
     * @param id The ID of the issue priority. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the issue priority is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPriorityCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/api/3/priority/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPriorityValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getPriority(Async)");
        }
        

        okhttp3.Call localVarCall = getPriorityCall(id, _callback);
        return localVarCall;

    }

    /**
     * Get priority
     * Returns an issue priority.  **[Permissions](#permissions) required:** Permission to access Jira.
     * @param id The ID of the issue priority. (required)
     * @return Priority
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the issue priority is not found. </td><td>  -  </td></tr>
     </table>
     */
    public Priority getPriority(String id) throws ApiException {
        ApiResponse<Priority> localVarResp = getPriorityWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get priority
     * Returns an issue priority.  **[Permissions](#permissions) required:** Permission to access Jira.
     * @param id The ID of the issue priority. (required)
     * @return ApiResponse&lt;Priority&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the issue priority is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Priority> getPriorityWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getPriorityValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<Priority>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get priority (asynchronously)
     * Returns an issue priority.  **[Permissions](#permissions) required:** Permission to access Jira.
     * @param id The ID of the issue priority. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the issue priority is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPriorityAsync(String id, final ApiCallback<Priority> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPriorityValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<Priority>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}