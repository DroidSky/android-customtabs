/*
 * Copyright 2017 Sascha Peilicke
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

package saschpe.android.customtabs;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.robolectric.RuntimeEnvironment;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public final class CustomTabsPackageHelperTest {
    @Ignore
    public void getPackageNameToUse() {
        // Arrange, act
        String packageName = CustomTabsPackageHelper.getPackageNameToUse(RuntimeEnvironment.application);

        // Verify
        assertEquals("foo", packageName);
    }
    @Test
    public void getPackages() {
        // Arrange, act
        List<String> packages = CustomTabsPackageHelper.getPackages();

        // Verify
        assertTrue(packages.contains(CustomTabsPackageHelper.STABLE_PACKAGE));
        assertTrue(packages.contains(CustomTabsPackageHelper.BETA_PACKAGE));
        assertTrue(packages.contains(CustomTabsPackageHelper.DEV_PACKAGE));
        assertTrue(packages.contains(CustomTabsPackageHelper.LOCAL_PACKAGE));
    }
}
