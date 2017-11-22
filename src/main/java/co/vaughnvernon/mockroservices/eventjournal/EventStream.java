//   Copyright © 2017 Vaughn Vernon. All rights reserved.
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package co.vaughnvernon.mockroservices.eventjournal;

import java.util.List;

public class EventStream {
  public final String snapshot;
  public final List<EventValue> stream;
  public final String streamName;
  public final int streamVersion;
  
  public boolean hasSnapshot() {
    return !snapshot.isEmpty();
  }
  
  protected EventStream(final String streamName, int streamVersion, List<EventValue> stream, final String snapshot) {
    this.streamName = streamName;
    this.streamVersion = streamVersion;
    this.stream = stream;
    this.snapshot = snapshot;
  }
}
