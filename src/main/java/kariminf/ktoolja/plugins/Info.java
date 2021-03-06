/*
 * This file is part of KToolJa
 * Karim Toolkit for Java
 * 
 * Copyright 2015-2016 Abdelkrime Aries <kariminfo0@gmail.com>
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

package kariminf.ktoolja.plugins;

/**
 * Info interface to be used with language-based plugins.
 * 
 * @author Abdelkrime Aries
 *
 */
public interface Info {
	
	/**
	 * 
	 * @return An indicator which point us to the right info file
	 */
	public String getIndicator();
	
	
	/**
	 * The prefix used in different processing classes the language. 
	 * For example: in preprocessing English texts, we get "En", where our classes are:
	 * EnNormalizer, EnStemmer, etc.
	 * 
	 * @return the prefix of classes
	 */
	public String getClassPrefix();

}
