/*
 *    NumericPrediction.java
 *    Copyright (C) 2000 Intelligenesis Corp.
 *
 */

package weka.classifiers.evaluation;

import java.io.Serializable;

/**
 * Encapsulates an evaluatable numeric prediction: the predicted class value
 * plus the actual class value.
 *
 * @author Len Trigg (len@intelligenesis.net)
 * @version $Revision: 1.3 $
 */
public class NumericPrediction implements Prediction, Serializable {

  /** The actual class value */
  private double m_Actual = MISSING_VALUE;

  /** The predicted class value */
  private double m_Predicted = MISSING_VALUE;

  /** The weight assigned to this prediction */
  private double m_Weight = 1;

  /**
   * Creates the NumericPrediction object with a default weight of 1.0.
   *
   * @param actual the actual value, or MISSING_VALUE.
   * @param predicted the predicted value, or MISSING_VALUE.
   */
  public NumericPrediction(double actual, double predicted) {

    this(actual, predicted, 1);
  }

  /**
   * Creates the NumericPrediction object.
   *
   * @param actual the actual value, or MISSING_VALUE.
   * @param predicted the predicted value, or MISSING_VALUE.
   * @param weight the weight assigned to the prediction.
   */
  public NumericPrediction(double actual, double predicted, double weight) {

    m_Actual = actual;
    m_Predicted = predicted;
    m_Weight = weight;
  }

  /** 
   * Gets the actual class value.
   *
   * @return the actual class value, or MISSING_VALUE if no
   * prediction was made.  
   */
  public double actual() { 

    return m_Actual; 
  }

  /**
   * Gets the predicted class value.
   *
   * @return the predicted class value, or MISSING_VALUE if no
   * prediction was made.  
   */
  public double predicted() { 

    return m_Predicted; 
  }

  /** 
   * Gets the weight assigned to this prediction. This is typically the weight
   * of the test instance the prediction was made for.
   *
   * @return the weight assigned to this prediction.
   */
  public double weight() { 

    return m_Weight; 
  }

  /**
   * Calculates the prediction error. This is defined as the predicted
   * value minus the actual value.
   *
   * @return the error for this prediction, or
   * MISSING_VALUE if either the actual or predicted value
   * is missing.  
   */
  public double error() {

    if ((m_Actual == MISSING_VALUE) ||
        (m_Predicted == MISSING_VALUE)) {
      return MISSING_VALUE;
    }
    return m_Predicted - m_Actual;
  }
}
