/*
 * Copyright 2013 Stanley Shyiko
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.shyiko.mysql.binlog.event;

/**
 * @author <a href="mailto:stanley.shyiko@gmail.com">Stanley Shyiko</a>
 */
public class FormatDescriptionEventData implements EventData {

    private int binlogVersion;
    private String serverVersion;
    private int headerLength;
    private int eventLength;

    public int getBinlogVersion() {
        return binlogVersion;
    }

    public void setBinlogVersion(int binlogVersion) {
        this.binlogVersion = binlogVersion;
    }

    public String getServerVersion() {
        return serverVersion;
    }

    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    public int getHeaderLength() {
        return headerLength;
    }

    public void setHeaderLength(int headerLength) {
        this.headerLength = headerLength;
    }

    public void setEventLength(int eventLength) {
        this.eventLength = eventLength;
    }

    public int getEventLength() {
        return eventLength;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("FormatDescriptionEventData");
        sb.append("{binlogVersion=").append(binlogVersion);
        sb.append(", serverVersion='").append(serverVersion).append('\'');
        sb.append(", headerLength=").append(headerLength);
        sb.append(", eventLength=").append(eventLength);
        sb.append('}');
        return sb.toString();
    }
}
