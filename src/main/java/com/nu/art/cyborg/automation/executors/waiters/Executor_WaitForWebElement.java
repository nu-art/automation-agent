/*
 * automation is the scenario automation testing framework allowing
 * the app to record last user actions, and in case of a crash serialize
 * the scenario into a file..
 *
 * Copyright (C) 2018  Adam van der Kruk aka TacB0sS
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
package com.nu.art.cyborg.automation.executors.waiters;

import com.nu.art.automation.models.waiter.Action_WaitForWebElement;
import com.robotium.solo.By;

public final class Executor_WaitForWebElement
	extends WaitForConditionExecutor<Action_WaitForWebElement> {

	protected final By getBy() {
		return super.getBy(step.getElementBy(), step.getCriteria());
	}

	@Override
	protected boolean checkCondition() {
		//		logInfo("Waiting for WebElement with " + step.getElementBy() + ": " + step.getCriteria());
		//		return solo.waitForWebElement(getBy(), 2000, true);
		return false;
	}
}
