using NUnit.Framework;
using RecipeSharing;


namespace RecipeSharing.Tests

{
	[TestFixture]
	public class RecipeTest
	{
		[Test]
		public void ShouldPass() {
			var receipe = new Recipe();
			Assert.True(1==1);
		}
	}
}