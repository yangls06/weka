/**
 *    KStarConstants.java
 *    Copyright (c) 1995-97 by Len Trigg (trigg@cs.waikato.ac.nz).
 *    Java port to Weka by Abdelaziz Mahoui (am14@cs.waikato.ac.nz).
 *
 */


package weka.classifiers.kstar;

/*
 * @author Len Trigg (len@intelligenesis.net)
 * @author Abdelaziz Mahoui (am14@cs.waikato.ac.nz)
 * @version $Revision 1.0 $
 */
public interface KStarConstants {

  /** Some usefull constants */
  public static final int    ON            = 1;
  public static final int    OFF           = 0;
  public static final int    NUM_RAND_COLS = 5;
  public static final double FLOOR         = 0.0;
  public static final double FLOOR1        = 0.1;
  public static final double INITIAL_STEP  = 0.05;
  public static final double LOG2          = 0.693147181;
  public static final double EPSILON       = 1.0e-5;

  /** How close the root finder for numeric and nominal have to get */
  public static final int    ROOT_FINDER_MAX_ITER = 40;
  public static final double ROOT_FINDER_ACCURACY = 0.01;

  /** Blend setting modes */
  public static final int B_SPHERE  = 1; /* Use sphere of influence */
  public static final int B_ENTROPY = 2; /* Use entropic blend setting */

  /** Missing value handling mode */

  /* Ignore the instance with the missing value */
  public static final int M_DELETE  = 1; 
  /* Treat missing values as maximally different */
  public static final int M_MAXDIFF = 2; 
  /* Normilize over the attributes */
  public static final int M_NORMAL  = 3; 
  /* Average column entropy curves */
  public static final int M_AVERAGE = 4; 
  
}
