/*
 * Copyright 2017 Oscar Galera i Alfaro.
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
package cat.ogasoft.protocolizer.exceptions;

/**
 * @author Oscar Galera i Alfaro
 * @date Apr 27, 2017 [5:14:45 PM]
 *
 * @brief Exception that must be raised if there is any problem in Dumpper phase.
 */
public class DumperException extends Exception {

    /**
     * @pre --
     * @post DeserializationException has been created with message.
     * @param message describing the dumper error.
     */
    public DumperException(String message) {
        super("Exception in Serialization phase, message: " + message);
    }

}
