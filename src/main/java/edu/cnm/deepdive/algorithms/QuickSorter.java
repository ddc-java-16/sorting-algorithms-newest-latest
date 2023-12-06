/*
 *  Copyright 2023 CNM Ingenuity, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package edu.cnm.deepdive.algorithms;

public class QuickSorter implements Sorter {

  @Override
  public void sort(int[] data) {
    sort(data, 0, data.length);
  }

  private void sort(int[] data, int fromIndex, int toIndex) {
    throw new UnsupportedOperationException("Not yet implemented");
    // TODO Implement these steps:
    //  .
    //  - If (toIndex > fromIndex + 1):
    //    .
    //    1. Select an index position, and the element at that position (pivotValue) from the range
    //       of data from fromIndex (inclusive) to toIndex (exclusive). This selection may simply be
    //       the first element in the range, a random selection with uniform likelihood across the
    //       range, the element with the median value of a random sample drawn from the range, etc.
    //    .
    //    2. Swap the values between pivot position and fromIndex, so that pivotValue is now located
    //       at fromIndex.
    //    .
    //    3. Define these variables and invariant conditions:
    //       .
    //       a. destinationIndex is initially fromIndex + 1.
    //       .
    //       b. Every element between fromIndex (inclusive) and destinationIndex (exclusive) must
    //          always have a value less than or equal pivotValue. Initially, that range contains
    //          only pivotValue (at fromIndex), so this condition is initially true, even if only
    //          trivially so.
    //       .
    //       c. currentIndex is our iteration index, and is initially fromIndex + 1.
    //       .
    //       d. Every element between destinationIndex (exclusive) and currentIndex (exclusive) must
    //          have a value greater than pivotValue. Initially, this range is empty, so this
    //          condition is initially (if trivially) true.
    //       .
    //    4. Iterate currentIndex from its initial value (fromIndex + 1) up to, but not including,
    //       toIndex. For each value of currentIndex:
    //       .
    //       a. currentValue is value at currentIndex position.
    //       .
    //       b. If currentValue <= pivotValue):
    //          .
    //           i. If currentIndex > destinationIndex:
    //              .
    //              * Swap the values at currentIndex and destinationIndex.
    //              .
    //          ii. Increment destinationIndex.
    //       .
    //    5. Swap the values between fromIndex and destinationIndex - 1. Now, all elements in the
    //       range from fromIndex (inclusive) to destinationIndex (exclusive) have values less than
    //       or equal to pivotValue, and all elements from destinationIndex (inclusive) to toIndex
    //       (exclusive) have values greater than pivotValue. pivotValue is now in its final
    //       position (at destinationIndex - 1).
    //    .
    //    6. Recursively invoke this method for the range from fromIndex (inclusive) to
    //       destinationIndex (exclusive) and the range from destinationIndex (exclusive) to toIndex
    //       (exclusive).
    //    .
    //    7. Done: The range of data from fromIndex (inclusive) to toIndex (exclusive) is now in
    //       ascending order.
  }

}
