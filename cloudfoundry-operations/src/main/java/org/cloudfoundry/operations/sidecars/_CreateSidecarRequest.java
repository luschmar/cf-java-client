/*
 * Copyright 2013-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cloudfoundry.operations.sidecars;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.cloudfoundry.Nullable;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
abstract class _CreateSidecarRequest {
    /**
     * 	Human-readable name for the sidecar
     */
    abstract String getName();
    /**
     * 	The command used to start the sidecar
     */
    abstract String getCommand();
    /**
     * 	The command used to start the sidecar
     */
    @JsonProperty("process_types")
    abstract List<String> getProcessTypes();

    @JsonProperty("memory_in_mb")
    @Nullable
    abstract Integer getMemoryInMb();
}