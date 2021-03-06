/*
 * Copyright 2016 WSO2 Inc. (http://wso2.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbon.metrics.jdbc.core.config.model;

import org.wso2.carbon.config.annotation.Configuration;
import org.wso2.carbon.config.annotation.Element;

import java.util.HashMap;
import java.util.Map;

/**
 * Configuration for data source.
 */
@Configuration(description = "Data Source Configuration")
public class DataSourceConfig {

    @Element(description = "The \"lookupDataSource\" flag specifies whether the datasource should be looked up via " +
            "JNDI. If this is set to true, the data source should be configured. " +
            "If this is set to false, the datasource will be created by the properties " +
            "defined in dataSourceProperties.")
    private boolean lookupDataSource = true;

    @Element(description = "JNDI name of the data source to be used by the JDBC Reporter.")
    private String dataSourceName = "java:comp/env/jdbc/WSO2MetricsDB";

    private JdbcScheduledCleanupConfig scheduledCleanup = new JdbcScheduledCleanupConfig();

    private Map<String, String> dataSourceProperties = new HashMap<>();

    public boolean isLookupDataSource() {
        return lookupDataSource;
    }

    public void setLookupDataSource(boolean lookupDataSource) {
        this.lookupDataSource = lookupDataSource;
    }

    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    public JdbcScheduledCleanupConfig getScheduledCleanup() {
        return scheduledCleanup;
    }

    public void setScheduledCleanup(JdbcScheduledCleanupConfig scheduledCleanup) {
        this.scheduledCleanup = scheduledCleanup;
    }

    public Map<String, String> getDataSourceProperties() {
        return dataSourceProperties;
    }

    public void setDataSourceProperties(Map<String, String> dataSourceProperties) {
        this.dataSourceProperties = dataSourceProperties;
    }
}
