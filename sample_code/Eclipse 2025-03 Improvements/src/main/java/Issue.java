
sealed abstract class Issue permits Bug, FeatureRequest {
 
	// ...

}

final class Bug extends Issue {}
final class FeatureRequest extends Issue {}
