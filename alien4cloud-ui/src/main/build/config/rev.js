// Renames files for browser caching purposes
module.exports = {
  dist: {
    files: {
      src: [
        '<%= yeoman.dist %>/scripts/{,*/}*.js',
        '<%= yeoman.dist %>/styles/{,*/}*.css'
      ]
    }
  }
};
