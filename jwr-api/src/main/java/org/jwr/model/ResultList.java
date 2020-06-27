package org.jwr.model;

import java.util.List;

/**
 * @author Willyams Yujra
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class ResultList<T> extends Result{
    /**
     * List of Object
     */
   private List<T> values;
}
