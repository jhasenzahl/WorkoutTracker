/**
 * Copyright 2013 Jonathan Hasenzahl
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jhasenzahl.workouttracker.exercise;

public class ExerciseInfo {

	public enum ExerciseType {
		STRENGTH("strength"), CARDIO("cardio");
		
		private final String id;
		
		private ExerciseType(String id) {
			this.id = id;
		}
		
		public static ExerciseType getExerciseTypeByString(String id) {
			if (id.equals(STRENGTH.toString())) {
				return STRENGTH;
			}
			return CARDIO;
		}
		
		@Override
		public String toString() {
			return id;
		}
	}
	
	private final String name;
	private final ExerciseType type;
	
	public ExerciseInfo(String name, ExerciseType type) {
		this.name = name;
		this.type = type;
	}
	
	public ExerciseInfo(String name, String type) {
		this.name = name;
		this.type = ExerciseType.getExerciseTypeByString(type);
	}

	public String getName() {
		return name;
	}

	public ExerciseType getType() {
		return type;
	}
	
}
