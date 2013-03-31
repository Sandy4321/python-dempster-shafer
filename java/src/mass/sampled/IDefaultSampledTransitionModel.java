/**
 * Dec 16, 2008
 */
package mass.sampled;

import hypothesis.Hypothesis;

/**
 * Interface for the state transition belief in a first-order hidden Markov model.
 * Acts as a simplification of the generic model <code>ISampledTransitionModel</code> when using the <code>SampledMassFunction</code> class.
 * 
 * @author Thomas Reineking
 *
 */
public interface IDefaultSampledTransitionModel<S extends Comparable<S>> extends ISampledTransitionModel<S, Hypothesis<S>, SampledMassFunction<S>> {

	// empty
	
}
