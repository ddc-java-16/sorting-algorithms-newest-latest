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

public class MergeSorter implements Sorter {

  @Override
  public void sort(int[] data) {
    sort(data, 0, data.length);
  }

  private void sort(int[] data, int fromIndex, int toIndex) {
    // TODO Implement these steps:
    //  .
    //  - If (toIndex > fromIndex + 1):
    if(toIndex > fromIndex + 1) {
      //    1. Subdivide the range from fromIndex (inclusive) to toIndex (exclusive); call these ranges
      //       left and right.

      int midpointindex = (fromIndex + toIndex) / 2;
      //    2. Recursively invoke this method for the left range and the right range.
      sort(data, fromIndex, midpointindex);
      sort(data, midpointindex, toIndex);
      //    3. Merge the left and right ranges together:

      //      a. Create a second (destination) array, large enough to hold (toIndex - fromIndex)
      //         elements.
      int[] destination = new int[toIndex - fromIndex];
      int destinationIndex = 0;
      int leftIndex = fromIndex;
      int rightIndex = midpointindex;

      //      b. Iterate over the left range and right range in lockstep, until either is exhausted:
      while (leftIndex < midpointindex && rightIndex < toIndex) {
        //        * If the value of the current element of the left range <= value of current element
        //          of the right range:
        int leftValue = data[leftIndex];
        int rightValue = data[rightIndex];
        if (leftValue <= rightValue) {
          //          - Copy the value of the current element of the left range to the next position of
          //            the destination array, and advance the index in the left range.
          destination[destinationIndex++] = leftValue;
          leftIndex++;
        } else {
          //          Otherwise:
          //          .
          //          - Copy the value of the current element of the range range to the next position of
          //            the destination array, and advance the index in the right range.
          destination[destinationIndex++] = leftValue;
          rightIndex++;
        }

        //      c. Copy remaining items in whichever of left and right range is not yet exhausted to
        //         the remaining portion of the destination array.
      }
      if (leftIndex < midpointindex) {

        System.arraycopy(data, leftIndex, destination, destinationIndex, midpointindex - leftIndex);
      } else {
        System.arraycopy(data, rightIndex, destination, destinationIndex, toIndex - rightIndex);

      }
      System.arraycopy(destination, 0, data, fromIndex, destination.length);
      //    4. Done: The range of data from fromIndex (inclusive) to toIndex (exclusive) is now in
      //       ascending order.
    }

  }
}
