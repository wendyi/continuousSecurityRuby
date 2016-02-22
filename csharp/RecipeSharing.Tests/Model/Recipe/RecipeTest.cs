using Xunit;
using RecipeSharing;


namespace RecipeSharing.Tests

{
	public class RecipeTest
	{
		[Fact]
		public void ShouldPass() {
			var receipe = new Recipe();
			Assert.True(1==1);
		}
	}
}