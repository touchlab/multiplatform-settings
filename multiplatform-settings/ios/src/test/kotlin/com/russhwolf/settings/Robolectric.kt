/*
 * Copyright 2018 Russell Wolf
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.russhwolf.settings

import kotlin.reflect.KClass

actual annotation class RunWith(actual val value: KClass<out Runner>)
actual abstract class Runner
actual class RobolectricTestRunner : SandboxTestRunner()
actual open class SandboxTestRunner : BlockJUnit4ClassRunner()
actual open class BlockJUnit4ClassRunner : ParentRunner<FrameworkMethod>()
actual class FrameworkMethod()
actual abstract class ParentRunner<T> : Runner()
